package no.kata.java.time;

import no.kata.java.BasicKata;

import java.time.LocalTime;

import static no.kata.java.time.MeetingOverlapJudgeKata.MeetingRequest;

public class MeetingOverlapJudgeKata implements BasicKata<MeetingRequest, Boolean> {

    public record MeetingRequest(LocalTime startA, LocalTime endA, LocalTime startB, LocalTime endB) {
    }

    @Override
    public Boolean solve(MeetingRequest input) {
        return null;
    }
}