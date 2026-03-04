package io.code.vanguard.brew.date;

import io.code.vanguard.brew.BasicKata;

import java.time.LocalDate;

import static io.code.vanguard.brew.date.VampireAgeCalculatorKata.AgeRequest;

public class VampireAgeCalculatorKata implements BasicKata<AgeRequest, Integer> {

    public record AgeRequest(LocalDate birthDate, LocalDate currentDate) {
    }

    @Override
    public Integer solve(AgeRequest input) {
        return null;
    }
}