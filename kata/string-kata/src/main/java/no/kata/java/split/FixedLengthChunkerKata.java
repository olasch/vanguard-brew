package no.kata.java.split;

import no.kata.java.BasicKata;

import java.util.List;

public class FixedLengthChunkerKata implements BasicKata<FixedLengthChunkerKata.ChunkRequest, List<String>> {

    public record ChunkRequest(String text, int chunkSize) {
    }

    @Override
    public List<String> solve(ChunkRequest input) {
        return null;
    }
}
