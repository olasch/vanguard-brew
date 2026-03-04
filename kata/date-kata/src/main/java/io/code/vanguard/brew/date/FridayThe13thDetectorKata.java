package io.code.vanguard.brew.date;

import io.code.vanguard.brew.BasicKata;

import static io.code.vanguard.brew.date.FridayThe13thDetectorKata.YearMonthRequest;

public class FridayThe13thDetectorKata implements BasicKata<YearMonthRequest, Boolean> {

    public record YearMonthRequest(int year, int month) {
    }

    @Override
    public Boolean solve(YearMonthRequest input) {
        return null;
    }
}
