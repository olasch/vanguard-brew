package no.kata.java.time;

import no.kata.java.BasicKata;

import java.time.ZonedDateTime;

import static no.kata.java.time.DstPhantomKata.PhantomRequest;

public class DstPhantomKata implements BasicKata<PhantomRequest, ZonedDateTime> {

    public record PhantomRequest(ZonedDateTime startTime, int exactHoursToAdd) {
    }

    @Override
    public ZonedDateTime solve(PhantomRequest input) {
        return null;
    }
}