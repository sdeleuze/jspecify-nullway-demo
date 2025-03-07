package org.example;

interface TokenExtractor {

	/**
	 * Extract a token from a {@link String}.
	 * @param input the input to process
	 * @return the extracted token or {@code null} if not found
	 */
	String extractToken(String input);
}
