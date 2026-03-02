package no.kata.java.date;

import no.kata.java.BasicKata;

import java.time.LocalDate;

import static no.kata.java.date.SubscriptionValidatorKata.SubscriptionRequest;

public class SubscriptionValidatorKata implements BasicKata<SubscriptionRequest, Boolean> {

    public record SubscriptionRequest(LocalDate startDate, int durationInMonths, LocalDate checkDate) {
    }

    @Override
    public Boolean solve(SubscriptionRequest input) {
        return null;
    }
}