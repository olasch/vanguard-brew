package no.kata.java.manipulation;

import no.kata.java.BasicKata;

public class SearchHighlighterKata implements BasicKata<SearchHighlighterKata.HighlightRequest, String> {

    public record HighlightRequest(String text, String term) {
    }

    @Override
    public String solve(HighlightRequest input) {
        return null;
    }
}