package io.code.vanguard.brew.date;

import io.code.vanguard.brew.BasicKata;

import java.time.LocalDate;

import static io.code.vanguard.brew.date.SprintPlannerKata.SprintRequest;

public class SprintPlannerKata implements BasicKata<SprintRequest, Integer> {

    public record SprintRequest(LocalDate startDate, LocalDate endDate) {
    }

    @Override
    public Integer solve(SprintRequest input) {
        return null;
    }
}