package no.kata.java.time;

import no.kata.java.BasicKata;

import java.time.LocalDateTime;

import static no.kata.java.time.RemoteTeamSyncKata.SyncRequest;

public class RemoteTeamSyncKata implements BasicKata<SyncRequest, LocalDateTime> {

    public record SyncRequest(LocalDateTime localTime, String sourceZone, String targetZone) {
    }

    @Override
    public LocalDateTime solve(SyncRequest input) {
        return null;
    }
}