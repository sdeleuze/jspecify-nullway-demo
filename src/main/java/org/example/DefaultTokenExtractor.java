package org.example;

public class DefaultTokenExtractor implements TokenExtractor {

	@Override
	public String extractToken(String input) {
		return (input.contains("token") ? "token" : null);
	}
}
