package no.kata.java.date;

import no.kata.java.BasicKata;

import java.time.LocalDate;

import static no.kata.java.date.SprintPlannerKata.SprintRequest;

public class SprintPlannerKata implements BasicKata<SprintRequest, Integer> {

    public record SprintRequest(LocalDate startDate, LocalDate endDate) {
    }

    @Override
    public Integer solve(SprintRequest input) {
        return null;
    }
}