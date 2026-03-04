package io.code.vanguard.brew.time;

import io.code.vanguard.brew.BasicKata;

import java.time.LocalDateTime;

import static io.code.vanguard.brew.time.RemoteTeamSyncKata.SyncRequest;

public class RemoteTeamSyncKata implements BasicKata<SyncRequest, LocalDateTime> {

    public record SyncRequest(LocalDateTime localTime, String sourceZone, String targetZone) {
    }

    @Override
    public LocalDateTime solve(SyncRequest input) {
        return null;
    }
}