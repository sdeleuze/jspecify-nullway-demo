package org.example;

import java.util.Arrays;

import org.jspecify.annotations.Nullable;

public class DefaultTokenExtractor implements TokenExtractor {

	@Override
	public @Nullable String[] extractTokens(String input) {

		return Arrays.stream(input.split(","))
				.map(elem -> (elem.isEmpty() ? null : elem))
				.toArray(String[]::new);
	}
}
