package io.code.vanguard.brew;

import org.jspecify.annotations.NonNull;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.Arrays;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BasicKataTestBase {

    private static final int TOTAL_WIDTH = 85;
    private static final int CONTENT_WIDTH = TOTAL_WIDTH - 2;
    private static final int HEADER_WIDTH = 10;

    /**
     * Runs once before any tests in the class are executed.
     * It prints the Name/Description of the Kata suite being run.
     */
    @BeforeAll
    static void initClass(final TestInfo testInfo) {
        printFrame("╔" + "═".repeat(TOTAL_WIDTH - 2) + "╗");
        printText("KATA SUITE: " + testInfo.getDisplayName());
        printFrame("╚" + "═".repeat(TOTAL_WIDTH - 2) + "╝");
    }

    /**
     * Runs before every individual test.
     * Uses TestInfo to print the name of the test about to execute.
     */
    @BeforeEach
    void init(final TestInfo testInfo) {
        printFrame("=".repeat(TOTAL_WIDTH));
        printText(testInfo.getDisplayName());
        printFrame("-".repeat(TOTAL_WIDTH));

    }

    @AfterEach
    void tearDown() {
        printFrame("-".repeat(TOTAL_WIDTH));
        System.out.println();
    }

    /**
     * A wrapper method to handle logging and assertions.
     * Use this instead of direct Assertions.assertEquals in your tests.
     *
     * @param kata     The implementation logic
     * @param input    The generic input
     * @param expected The expected generic output
     * @param verifier The verifier used for comparing
     * @param <I>      Input type
     * @param <R>      Output type
     */
    protected <I, R> void verify(BasicKata<I, R> kata, I input, R expected, BiPredicate<R, R> verifier) {
        String prettyInput = prettyFormat(input);
        String prettyExpected = prettyFormat(expected);

        printWithHeader("Input", prettyInput);
        printWithHeader("Expecting", prettyExpected);

        R actual = kata.solve(input);

        doVerify(expected, verifier, actual, prettyExpected);
    }

    /**
     * A wrapper method to handle logging and assertions.
     * Use this instead of direct Assertions.assertEquals in your tests.
     *
     * @param kata      The implementation logic
     * @param expected  The expected generic output
     * @param extractor The actual result using the returned value from the kata
     * @param verifier  The verifier used for comparing
     * @param <A>       Output type of the kata
     * @param <R>       Result type from the extractor
     */
    protected <R, A> void verify(BasicNoArgKata<A> kata, R expected, Function<A, R> extractor, BiPredicate<R, R> verifier) {
        String prettyExpected = prettyFormat(expected);
        printWithHeader("Expecting", prettyExpected);

        A actual = kata.solve();

        String prettyActual = prettyFormat(actual);
        printWithHeader("Returned", prettyActual);

        R result = Optional.ofNullable(actual)
                .map(extractor)
                .orElse(null);

        doVerify(expected, verifier, result, prettyExpected);
    }

    private static <R> void doVerify(R expected, BiPredicate<R, R> verifier, R actual, String prettyExpected) {
        String prettyActual = prettyFormat(actual);
        printWithHeader("Actual", prettyActual);
        System.out.println();

        if (!verifier.test(expected, actual)) {
            String failureMessage = "❌ Kata failed! Expected " + prettyExpected + " but got " + prettyActual;
            printText(failureMessage);

            Assertions.fail(failureMessage);
        }

        printText("✅ Kata Passed!");
    }

    private static void printFrame(String text) {
        printWrapped("", text, 0, TOTAL_WIDTH);
    }

    private static void printText(String text) {
        printWrapped("", text, 0, CONTENT_WIDTH);
    }

    private static void printWithHeader(String header, String text) {
        printWrapped(header, text, HEADER_WIDTH, CONTENT_WIDTH);
    }

    private static void printWrapped(String header, String text, int headerWidth, int textWidth) {
        final AtomicBoolean isFirstLine = new AtomicBoolean(true);

        String regex = "(?s).{1," + (textWidth - headerWidth) + "}(?!\\S)";

        Pattern.compile(regex)
                .matcher(text)
                .results()
                .map(MatchResult::group)
                .forEachOrdered(doPrint(header, headerWidth, isFirstLine));
    }

    private static @NonNull Consumer<String> doPrint(String header, int headerWidth, AtomicBoolean isFirstLine) {
        return line -> {
            if (headerWidth == 0) {
                System.out.printf("%n%s", line.trim());
            } else {
                System.out.printf("%n%-" + headerWidth + "s %s",
                        isFirstLine.getAndSet(false) ? header : "",
                        line.trim()
                );
            }
        };
    }

    private static <I> String prettyFormat(I input) {

        if (input == null) {
            return "null";
        }

        if (input instanceof String[] strings) {
            return Arrays.toString(strings);
        }

        if ("".equals(input)) {
            return "''";
        }

        return input.toString();
    }
}
