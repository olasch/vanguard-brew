package io.code.vanguard.brew.time;

import io.code.vanguard.brew.BasicKata;

import java.time.LocalTime;

import static io.code.vanguard.brew.time.MeetingOverlapJudgeKata.MeetingRequest;

public class MeetingOverlapJudgeKata implements BasicKata<MeetingRequest, Boolean> {

    public record MeetingRequest(LocalTime startA, LocalTime endA, LocalTime startB, LocalTime endB) {
    }

    @Override
    public Boolean solve(MeetingRequest input) {
        return null;
    }
}