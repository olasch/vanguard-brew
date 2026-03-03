package no.kata.java.time;

import no.kata.java.BasicKata;

import java.time.LocalDateTime;

import static no.kata.java.time.RedEyeFlightKata.FlightRequest;

public class RedEyeFlightKata implements BasicKata<FlightRequest, String> {

    public record FlightRequest(LocalDateTime departure, LocalDateTime arrival) {
    }

    @Override
    public String solve(FlightRequest input) {
        return null;
    }
}