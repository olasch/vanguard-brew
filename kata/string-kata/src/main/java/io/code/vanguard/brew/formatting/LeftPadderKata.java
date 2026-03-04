package io.code.vanguard.brew.formatting;

import io.code.vanguard.brew.BasicKata;

public class LeftPadderKata implements BasicKata<LeftPadderKata.PadRequest, String> {

    public record PadRequest(String text, int targetLength, char padChar) {
    }

    @Override
    public String solve(PadRequest input) {
        return null;
    }
}
