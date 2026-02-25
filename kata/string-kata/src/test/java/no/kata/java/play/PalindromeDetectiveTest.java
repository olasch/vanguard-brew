package no.kata.java.play;

import no.kata.java.BasicKataTestBase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.Objects;

@DisplayName("String - Palindrome Detective")
@Tag("String")
public class PalindromeDetectiveTest extends BasicKataTestBase {

    @Test
    @DisplayName("When receiving a simple lowercase palindrome, returns true. " +
            "E.g.: 'madam' returns true")
    @Order(1)
    void testSimplePalindrome() {
        verify(new PalindromeDetectiveKata(),
                "madam",
                true,
                Objects::equals);
    }

    @Test
    @DisplayName("When receiving a standard word that is NOT a palindrome, returns false. " +
            "E.g.: 'hello' returns false")
    @Order(2)
    void testStandardNonPalindrome() {
        verify(new PalindromeDetectiveKata(),
                "hello",
                false,
                Objects::equals);
    }

    @Test
    @DisplayName("When receiving a complex sentence, ignores spaces, casing, and punctuation. " +
            "E.g.: 'A man, a plan, a canal: Panama' returns true")
    @Order(3)
    void testComplexSentencePalindrome() {
        verify(new PalindromeDetectiveKata(),
                "A man, a plan, a canal: Panama",
                true,
                Objects::equals);
    }

    @Test
    @DisplayName("When receiving numeric strings, correctly identifies numeric palindromes. " +
            "E.g.: '123 321' returns true")
    @Order(4)
    void testNumericPalindrome() {
        verify(new PalindromeDetectiveKata(),
                "1234 4321",
                true,
                Objects::equals);
    }

    @Test
    @DisplayName("When receiving an empty string or null, safely handles the edge case. " +
            "E.g.: '' returns true, null returns false")
    @Order(5)
    void testEmptyAndNull() {
        // An empty string reads the same forwards and backwards, so it is true!
        verify(new PalindromeDetectiveKata(),
                "",
                true,
                Objects::equals);

        verify(new PalindromeDetectiveKata(),
                null,
                false,
                Objects::equals);
    }
}