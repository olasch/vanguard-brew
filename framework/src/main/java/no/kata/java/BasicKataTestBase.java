package no.kata.java;

import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.function.BiPredicate;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BasicKataTestBase {

    public static final int WIDTH = 85;

    /**
     * Runs once before any tests in the class are executed.
     * It prints the Name/Description of the Kata suite being run.
     */
    @BeforeAll
    static void initClass(final TestInfo testInfo) {
        System.out.println();
        System.out.println("╔" + "═".repeat(WIDTH-2) + "╗");
        System.out.println("║ KATA SUITE: " + testInfo.getDisplayName());
        System.out.println("╚" + "═".repeat(WIDTH-2) + "╝");
    }

    /**
     * Runs before every individual test.
     * Uses TestInfo to print the name of the test about to execute.
     */
    @BeforeEach
    void init(final TestInfo testInfo) {
        System.out.println("\n" + "=".repeat(WIDTH));
        System.out.printf("🚀 Executing : %s", testInfo.getDisplayName());
        System.out.println("\n" + "-".repeat(WIDTH));
    }

    @AfterEach
    void tearDown() {
        System.out.println("-".repeat(WIDTH));
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

        System.out.println("   Input     : " + prettyInput);
        System.out.println("   Expecting : " + prettyExpected);

        R actual = kata.solve(input);

        String prettyActual = prettyFormat(actual);
        System.out.println("   Actual    : " + prettyActual);

        if (!verifier.test(expected, actual)) {
            String failureMessage = "❌ Kata failed! Expected " + prettyExpected + " but got " + prettyActual;
            System.out.println(failureMessage);

            Assertions.fail(failureMessage);
        }

        System.out.println("✅ Result   : PASS");
    }

    private static <I> String prettyFormat(I input) {

        if (input == null) {
            return "null";
        }

        if (input instanceof String[] strings) {
            return Arrays.toString(strings);
        }

        return input.toString();
    }
}
