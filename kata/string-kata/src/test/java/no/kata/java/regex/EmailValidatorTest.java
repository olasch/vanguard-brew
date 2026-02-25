package no.kata.java.regex;

import no.kata.java.BasicKataTestBase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.Objects;

@DisplayName("String - Bouncer (Email Validator)")
@Tag("String")
public class EmailValidatorTest extends BasicKataTestBase {

    @Test
    @DisplayName("When receiving a perfectly formatted email, returns true.")
    @Order(1)
    void testValidEmail() {
        verify(new EmailValidatorKata(),
                "tony.stark@avengers.com",
                true,
                Objects::equals);
    }

    @Test
    @DisplayName("When the email is missing the @ symbol, returns false.")
    @Order(2)
    void testMissingAtSymbol() {
        verify(new EmailValidatorKata(),
                "peter.parker.dailybugle.net",
                false,
                Objects::equals);
    }

    @Test
    @DisplayName("When the email is missing the domain extension (the dot), returns false.")
    @Order(3)
    void testMissingDomainExtension() {
        verify(new EmailValidatorKata(),
                "bruce.wayne@batcave",
                false,
                Objects::equals);
    }

    @Test
    @DisplayName("When the email contains illegal spaces, returns false.")
    @Order(4)
    void testIllegalSpaces() {
        verify(new EmailValidatorKata(),
                "clark kent@dailyplanet.com",
                false,
                Objects::equals);
    }

    @Test
    @DisplayName("When the email has multiple @ symbols, returns false.")
    @Order(5)
    void testMultipleAtSymbols() {
        verify(new EmailValidatorKata(),
                "neo@matrix@zion.org",
                false,
                Objects::equals);
    }
}