package org.example;

import org.jspecify.annotations.Nullable;

public class Main {

	public static void main(String[] args) {
		TokenExtractor extractor = new DefaultTokenExtractor();
		@Nullable String[] tokens = extractor.extractTokens("a,b,,d");
		for (String token : tokens) {
			if (token == null) {
				System.out.println("No token detected");
			}
			else {
				System.out.println("The token " + token + " has a length of " + token.length());
			}

		}
	}
}