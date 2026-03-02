package no.kata.java.date;

import no.kata.java.BasicKata;

import static no.kata.java.date.FridayThe13thDetectorKata.YearMonthRequest;

public class FridayThe13thDetectorKata implements BasicKata<YearMonthRequest, Boolean> {

    public record YearMonthRequest(int year, int month) {
    }

    @Override
    public Boolean solve(YearMonthRequest input) {
        return null;
    }
}
