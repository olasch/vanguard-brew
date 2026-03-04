package io.code.vanguard.brew.manipulation;

import io.code.vanguard.brew.BasicKata;

public class DynamicCensorKata implements BasicKata<DynamicCensorKata.CensorRequest, String> {

    public record CensorRequest(String text, String badWord) {
    }

    @Override
    public String solve(CensorRequest input) {
        return null;
    }
}