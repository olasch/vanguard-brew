package no.kata.java.regex;

import no.kata.java.BasicKataTestBase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.Objects;

@DisplayName("String - Agent ID Validator")
@Tag("String")
public class AgentValidatorTest extends BasicKataTestBase {

    @Test
    @DisplayName("When receiving a perfectly formatted ID, returns true. " +
            "E.g.: 'AGENT-1234' returns true")
    @Order(1)
    void testValidAgentId() {
        verify(new AgentValidatorKata(),
                "AGENT-0007",
                true,
                Objects::equals);
    }

    @Test
    @DisplayName("When receiving an ID with lowercase letters, rejects it. " +
            "E.g.: 'agent-9999' returns false")
    @Order(2)
    void testLowercaseRejection() {
        verify(new AgentValidatorKata(),
                "agent-1138",
                false,
                Objects::equals);
    }

    @Test
    @DisplayName("When receiving an ID with too few digits, rejects it. " +
            "E.g.: 'AGENT-99' returns false")
    @Order(3)
    void testTooFewDigits() {
        verify(new AgentValidatorKata(),
                "AGENT-47",
                false,
                Objects::equals);
    }

    @Test
    @DisplayName("When receiving an ID with letters mixed into the numbers, rejects it. " +
            "E.g.: 'AGENT-12A4' returns false")
    @Order(4)
    void testLettersInDigits() {
        verify(new AgentValidatorKata(),
                "AGENT-C3P0",
                false,
                Objects::equals);
    }

    @Test
    @DisplayName("When receiving a string that contains the ID but has extra text around it, rejects it. " +
            "E.g.: 'Hello AGENT-1234 !!' returns false")
    @Order(5)
    void testUnanchoredText() {
        verify(new AgentValidatorKata(),
                "Greetings AGENT-86, your mission is ready.",
                false,
                Objects::equals);
    }
}
