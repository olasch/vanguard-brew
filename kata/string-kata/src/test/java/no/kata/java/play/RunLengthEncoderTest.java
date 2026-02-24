package no.kata.java.play;

import no.kata.java.BasicKataTestBase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.Objects;

@DisplayName("String - Run-Length Encoder")
@Tag("String")
public class RunLengthEncoderTest extends BasicKataTestBase {

    @Test
    @DisplayName("When receiving a string with consecutive repeating letters, compresses them with counts. " +
            "E.g.: 'aaaabbc' returns 'a4b2c1'")
    @Order(1)
    void testStandardCompression() {
        verify(new RunLengthEncoderKata(),
                "Goooolluuumm",
                "G1o4l2u3m2",
                Objects::equals);
    }

    @Test
    @DisplayName("When receiving a string with no consecutive duplicates, appends a 1 to every letter. " +
            "E.g.: 'abc' returns 'a1b1c1'")
    @Order(2)
    void testAllUniqueCharacters() {
        verify(new RunLengthEncoderKata(),
                "Bazinga",
                "B1a1z1i1n1g1a1",
                Objects::equals);
    }

    @Test
    @DisplayName("When receiving a string with a very long continuous run, counts them accurately. " +
            "E.g.: 'abbbbbbbbc' returns 'a1b8c1'")
    @Order(3)
    void testLongCharacterRuns() {
        verify(new RunLengthEncoderKata(),
                "Khaleeeeesi",
                "K1h1a1l1e5s1i1",
                Objects::equals);
    }

    @Test
    @DisplayName("When receiving mixed casing of the same letter, treats them as completely separate runs. " +
            "E.g.: 'aAaA' returns 'a1A1a1A1'")
    @Order(4)
    void testCaseSensitivity() {
        verify(new RunLengthEncoderKata(),
                "HaHaHa",
                "H1a1H1a1H1a1",
                Objects::equals);
    }

    @Test
    @DisplayName("When receiving special characters and punctuation, compresses them exactly like letters. " +
            "E.g.: '!!!???' returns '!3?3'")
    @Order(5)
    void testSymbolsAndPunctuation() {
        verify(new RunLengthEncoderKata(),
                "PeWPeWPeW!!!",
                "P1e1W1P1e1W1P1e1W1!3",
                Objects::equals);
    }
}