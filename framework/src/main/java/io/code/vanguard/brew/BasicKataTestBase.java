package io.code.vanguard.brew;

<<<<<<< HEAD
import org.jspecify.annotations.NonNull;
=======
>>>>>>> upstream/main
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestMethodOrder;

<<<<<<< HEAD
import java.util.Arrays;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;
=======
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;

import static io.code.vanguard.brew.Printerface.TOTAL_WIDTH;
import static io.code.vanguard.brew.Printerface.prettyFormat;
import static io.code.vanguard.brew.Printerface.printFrame;
import static io.code.vanguard.brew.Printerface.printText;
import static io.code.vanguard.brew.Printerface.printWithHeader;
>>>>>>> upstream/main

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BasicKataTestBase {

<<<<<<< HEAD
    private static final int TOTAL_WIDTH = 85;
    private static final int CONTENT_WIDTH = TOTAL_WIDTH - 2;
    private static final int HEADER_WIDTH = 10;

    /**
     * Runs once before any tests in the class are executed.
     * It prints the Name/Description of the Kata suite being run.
     */
=======
>>>>>>> upstream/main
    @BeforeAll
    static void initClass(final TestInfo testInfo) {
        printFrame("╔" + "═".repeat(TOTAL_WIDTH - 2) + "╗");
        printText("KATA SUITE: " + testInfo.getDisplayName());
        printFrame("╚" + "═".repeat(TOTAL_WIDTH - 2) + "╝");
    }

<<<<<<< HEAD
    /**
     * Runs before every individual test.
     * Uses TestInfo to print the name of the test about to execute.
     */
=======
>>>>>>> upstream/main
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
<<<<<<< HEAD
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
=======
     * {@link BasicKata} verify method.
     * <p/>
     * A method to handle logging and assertions.
     * Use this instead of direct Assertions.assertEquals in your tests.
     *
     * @param kata     The implementation logic
     * @param input    The input
     * @param expected The expected output
     * @param verifier The verifier used for comparing
     * @param <I>      Input type
     * @param <R>      Result type
     */
    protected <I, R> void verify(BasicKata<I, R> kata,
                                 I input,
                                 R expected,
                                 BiPredicate<R, R> verifier) {
        printWithHeader("Input", prettyFormat(input));
        printWithHeader("Expecting", prettyFormat(expected));

        R actual = kata.solve(input);

        doVerify(expected, verifier, actual);
    }

    /**
     * {@link BasicNoArgKata} verify method.
     * <p/>
     * A method to handle logging and assertions.
     * Use this instead of direct Assertions.assertEquals in your tests.
     *
     * @param kata      The implementation logic
     * @param expected  The expected output
     * @param extractor The extractor to calculate the result based on the kata
>>>>>>> upstream/main
     * @param verifier  The verifier used for comparing
     * @param <A>       Output type of the kata
     * @param <R>       Result type from the extractor
     */
<<<<<<< HEAD
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
=======
    protected <R, A> void verify(BasicNoArgKata<A> kata,
                                 R expected,
                                 Function<A, R> extractor,
                                 BiPredicate<R, R> verifier) {
        printWithHeader("Expecting", prettyFormat(expected));

        A actual = kata.solve();

        printWithHeader("Returned", prettyFormat(actual));

        R result = Optional.ofNullable(actual)
                           .map(extractor)
                           .orElse(null);

        doVerify(expected, verifier, result);
    }

    /**
     * Method for verifying the implemented {@link K}-class for this kata.
     * <p/>
     * A method to handle logging and assertions.
     * Use this instead of direct Assertions.assertEquals in your tests.
     *
     * @param kata      The implemented class
     * @param action    The actions to perform on the kata that is implemented
     * @param extractor The actual result using the extractor to calculate the result
     * @param verifier  The verifier used for comparing
     * @param <K>       The Kata-class
     * @param <R>       Result type from the extractor
     */
    protected <K, R> void verify(K kata,
                                 Consumer<K> action,
                                 Function<K, R> extractor,
                                 R expectedResult,
                                 BiPredicate<R, R> verifier) {

        printWithHeader("Expecting", prettyFormat(expectedResult));

        action.accept(kata);

        R actualResult = extractor.apply(kata);

        doVerify(expectedResult, verifier, actualResult);
    }

    /**
     * {@link Throwable} verification method
     * <p/>
     * A method to handle logging and assertions.
     * Use this instead of direct Assertions.assertEquals in your tests.
     *
     * @param executableAction  The action to be called to trigger an exception
     * @param expectedException The expected exception to be thrown
     * @param verifier          The verifier used for comparing
     * @param <A>               Type of actual excepting
     * @param <E>               Type of the expected exception
     */

    protected <A extends Throwable, E extends Throwable> void verify(Runnable executableAction,
                                                                     E expectedException,
                                                                     BiPredicate<E, A> verifier) {

        printWithHeader("Expecting", prettyFormat(expectedException));

        final A actualException = doExecute(executableAction);

        doVerify(expectedException, verifier, actualException);
    }

    private <A extends Throwable> A doExecute(Runnable executableAction) {
        try {
            executableAction.run();
            return null;
        } catch (Throwable t) {
            //noinspection unchecked
            return (A) t;
        }
    }


    private static <R, A> void doVerify(R expected,
                                        BiPredicate<R, A> verifier,
                                        A actual) {
>>>>>>> upstream/main
        String prettyActual = prettyFormat(actual);
        printWithHeader("Actual", prettyActual);
        System.out.println();

        if (!verifier.test(expected, actual)) {
<<<<<<< HEAD
            String failureMessage = "❌ Kata failed! Expected " + prettyExpected + " but got " + prettyActual;
=======
            String failureMessage =
                    "❌ Kata failed! Expected " + prettyFormat(expected) + " " + "but got " + prettyActual;
>>>>>>> upstream/main
            printText(failureMessage);

            Assertions.fail(failureMessage);
        }

        printText("✅ Kata Passed!");
    }
<<<<<<< HEAD

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
=======
>>>>>>> upstream/main
}
