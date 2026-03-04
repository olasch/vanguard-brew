package io.code.vanguard.brew.time;

import io.code.vanguard.brew.BasicKata;

import java.time.ZonedDateTime;

import static io.code.vanguard.brew.time.DstPhantomKata.PhantomRequest;

public class DstPhantomKata implements BasicKata<PhantomRequest, ZonedDateTime> {

    public record PhantomRequest(ZonedDateTime startTime, int exactHoursToAdd) {
    }

    @Override
    public ZonedDateTime solve(PhantomRequest input) {
        return null;
    }
}