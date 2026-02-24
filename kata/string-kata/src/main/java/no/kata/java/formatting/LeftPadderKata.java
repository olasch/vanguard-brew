package no.kata.java.formatting;

import no.kata.java.BasicKata;

public class LeftPadderKata implements BasicKata<LeftPadderKata.PadRequest, String> {

    public record PadRequest(String text, int targetLength, char padChar) {
    }

    @Override
    public String solve(PadRequest input) {
        return null;
    }
}
