package io.code.vanguard.brew.split;

import io.code.vanguard.brew.BasicKata;

import java.util.List;

public class FixedLengthChunkerKata implements BasicKata<FixedLengthChunkerKata.ChunkRequest, List<String>> {

    public record ChunkRequest(String text, int chunkSize) {
    }

    @Override
    public List<String> solve(ChunkRequest input) {
        return null;
    }
}
