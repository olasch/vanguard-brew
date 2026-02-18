package no.kata.java;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

@DisplayName("String Split")
public class StringSplitTest extends BasicKataTestBase {

    @Test
    @DisplayName(
            "When receiving a string containing ' ' as a separator, returns an array containing all of the parts of the string " +
                    "E.g.: 'one two' returns ['one', 'two']")
    @Order(1)
    void testSplitStringWithSpace() {
        verify(new StringSplitKata(),
                "public static void",
                new String[]{"public", "static", "void"},
                Arrays::equals);
    }

    @Test
    @DisplayName(
            "When receiving a string containing ';' as a separator, returns an array containing all of the parts of the string " +
                    "E.g.: 'one;two' returns ['one', 'two']")
    @Order(2)
    void testSplitStringWithSemicolon() {
        verify(new StringSplitKata(),
                "public;static;void",
                new String[]{"public", "static", "void"},
                Arrays::equals);
    }

    @Test
    @DisplayName(
            "When receiving a string containing ';' or ' ' as a separator, returns an array containing all of the parts of the string " +
                    "E.g.: 'one two;full' returns ['one', 'two', 'full']")
    @Order(3)
    void testSplitStringWithSemicolonOrBlank() {
        verify(new StringSplitKata(),
                "public static;void main;interface boat @ car",
                new String[]{"public", "static", "void", "main", "interface", "boat", "@", "car"},
                Arrays::equals);
    }
}
