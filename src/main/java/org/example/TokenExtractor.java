package org.example;

import org.jspecify.annotations.Nullable;

interface TokenExtractor {

	/**
	 * Extract tokens from a {@link String}.
	 * @param input the input to process
	 * @return the extracted tokens
	 */
	@Nullable String[] extractTokens(String input);
}
