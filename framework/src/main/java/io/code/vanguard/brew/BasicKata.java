package io.code.vanguard.brew;

/**
 * An interface for a basic code kata.
 * By basic, we are aiming at a kata that can be completed with only what is available in the JDK.
 *
 * @param <I> The type of the input to this kata
 * @param <R> The type of the result from this kata
 */

public interface BasicKata<I, R> {
    R solve(I input);
}
