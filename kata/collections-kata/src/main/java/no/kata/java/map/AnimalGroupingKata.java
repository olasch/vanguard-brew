package no.kata.java.map;

import no.kata.java.BasicKata;

import java.util.List;
import java.util.Map;

public class AnimalGroupingKata implements BasicKata<List<AnimalGroupingKata.Animal>, Map<String, List<AnimalGroupingKata.Animal>>> {

    public record Animal(String id, String species, String name) {
    }

    @Override
    public Map<String, List<Animal>> solve(List<Animal> input) {
        return null;
    }
}