package org.example;

import org.jspecify.annotations.Nullable;

interface TokenExtractor {

	/**
	 * Extract a token from a {@link String}.
	 * @param input the input to process
	 * @return the extracted token or {@code null} if not found
	 */
	@Nullable
	String extractToken(String input);
}
