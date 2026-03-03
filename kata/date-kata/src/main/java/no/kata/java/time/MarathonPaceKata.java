package no.kata.java.time;

import no.kata.java.BasicKata;

import java.time.Duration;

import static no.kata.java.time.MarathonPaceKata.PaceRequest;

public class MarathonPaceKata implements BasicKata<PaceRequest, Duration> {

    public record PaceRequest(Duration totalTime, int distanceKm) {
    }

    @Override
    public Duration solve(PaceRequest input) {
        return null;
    }
}
