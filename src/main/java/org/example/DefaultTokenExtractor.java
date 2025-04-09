package org.example;

import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

public class DefaultTokenExtractor implements TokenExtractor {

	@Override
	public @Nullable String extractToken(@NonNull String input) {
		return (input.contains("token") ? "token" : null);
	}
}
