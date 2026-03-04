package io.code.vanguard.brew.formatting;

import io.code.vanguard.brew.BasicKata;

public class EllipsisTruncatorKata implements BasicKata<EllipsisTruncatorKata.TruncateRequest, String> {

    public record TruncateRequest(String text, int maxLength) {
    }

    @Override
    public String solve(TruncateRequest input) {
        return null;
    }
}
