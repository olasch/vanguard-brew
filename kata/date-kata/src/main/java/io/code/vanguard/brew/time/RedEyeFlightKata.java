package io.code.vanguard.brew.time;

import io.code.vanguard.brew.BasicKata;

import java.time.LocalDateTime;

import static io.code.vanguard.brew.time.RedEyeFlightKata.FlightRequest;

public class RedEyeFlightKata implements BasicKata<FlightRequest, String> {

    public record FlightRequest(LocalDateTime departure, LocalDateTime arrival) {
    }

    @Override
    public String solve(FlightRequest input) {
        return null;
    }
}