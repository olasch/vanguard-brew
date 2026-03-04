package io.code.vanguard.brew.date;

import io.code.vanguard.brew.BasicKata;

import java.time.LocalDate;

import static io.code.vanguard.brew.date.SubscriptionValidatorKata.SubscriptionRequest;

public class SubscriptionValidatorKata implements BasicKata<SubscriptionRequest, Boolean> {

    public record SubscriptionRequest(LocalDate startDate, int durationInMonths, LocalDate checkDate) {
    }

    @Override
    public Boolean solve(SubscriptionRequest input) {
        return null;
    }
}