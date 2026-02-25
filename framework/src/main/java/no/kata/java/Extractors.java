package no.kata.java;

import java.util.function.BiFunction;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * This interface has implemented extractors
 * that can be used for extracting data based on what is returned from the kata
 * and the object to find it from.
 * <p/>
 * Usage is typically that the kata returns a regex or a config, and then this applies that to the input
 * and returns that result.
 *
 */

public interface Extractors {

    /**
     * Takes a regex from a kata, finds all the matches, and returns that as a string separated by ",".
     */
    BiFunction<String, String, String> regexGroupsAsString = (regex, textToSearch) ->
            Pattern.compile(regex)
                    .matcher(textToSearch)
                    .results()
                    .map(MatchResult::group)
                    .collect(Collectors.joining(","));

}
