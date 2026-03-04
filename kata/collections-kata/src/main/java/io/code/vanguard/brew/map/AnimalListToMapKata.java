package io.code.vanguard.brew.map;

import io.code.vanguard.brew.BasicKata;

import java.util.List;
import java.util.Map;

public class AnimalListToMapKata implements BasicKata<List<AnimalListToMapKata.Animal>, Map<String, AnimalListToMapKata.Animal>> {

    public record Animal(String id, String species, String name) {
    }

    @Override
    public Map<String, Animal> solve(List<Animal> input) {
        return null;
    }
}
