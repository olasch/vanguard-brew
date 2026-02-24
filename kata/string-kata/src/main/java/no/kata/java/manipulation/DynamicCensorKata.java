package no.kata.java.manipulation;

import no.kata.java.BasicKata;

public class DynamicCensorKata implements BasicKata<DynamicCensorKata.CensorRequest, String> {

    public record CensorRequest(String text, String badWord) {
    }

    @Override
    public String solve(CensorRequest input) {
        return null;
    }
}