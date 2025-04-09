package org.example;

import org.jspecify.annotations.Nullable;

public class DefaultTokenExtractor implements TokenExtractor {

	@Override
	public String @Nullable [] extractTokens(String input) {
		var tokens = input.split(",");
		return tokens.length == 0 ? null : tokens;
	}
}
