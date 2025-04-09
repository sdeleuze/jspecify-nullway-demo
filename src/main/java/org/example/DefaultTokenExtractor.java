package org.example;

import org.jspecify.annotations.Nullable;

public class DefaultTokenExtractor implements TokenExtractor {

	@Override
	public Wrapper<@Nullable String> extractToken(String input) {
		return new Wrapper<@Nullable String>(input.contains("token") ? "token" : null);
	}
}
