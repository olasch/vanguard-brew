package no.kata.java.formatting;

import no.kata.java.BasicKata;

public class EllipsisTruncatorKata implements BasicKata<EllipsisTruncatorKata.TruncateRequest, String> {

    public record TruncateRequest(String text, int maxLength) {
    }

    @Override
    public String solve(TruncateRequest input) {
        return null;
    }
}
