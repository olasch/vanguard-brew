package no.kata.java.date;

import no.kata.java.BasicKata;

import java.time.LocalDate;

import static no.kata.java.date.VampireAgeCalculatorKata.AgeRequest;

public class VampireAgeCalculatorKata implements BasicKata<AgeRequest, Integer> {

    public record AgeRequest(LocalDate birthDate, LocalDate currentDate) {
    }

    @Override
    public Integer solve(AgeRequest input) {
        return null;
    }
}