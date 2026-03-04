package io.code.vanguard.brew;

/**
 * An interface for a basic code kata where there are no input.
 * This is typically used for a kata where we are to test the understanding of an API or config or RegEx.
 * By basic, we are aiming at a kata that can be completed with only what is available in the JDK.
 *
 * @param <R> The type of the result from this kata
 */

public interface BasicNoArgKata<R> {
    R solve();
}
