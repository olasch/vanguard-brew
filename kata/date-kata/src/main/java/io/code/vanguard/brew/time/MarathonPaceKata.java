package io.code.vanguard.brew.time;

import io.code.vanguard.brew.BasicKata;

import java.time.Duration;

import static io.code.vanguard.brew.time.MarathonPaceKata.PaceRequest;

public class MarathonPaceKata implements BasicKata<PaceRequest, Duration> {

    public record PaceRequest(Duration totalTime, int distanceKm) {
    }

    @Override
    public Duration solve(PaceRequest input) {
        return null;
    }
}
