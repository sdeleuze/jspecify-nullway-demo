package org.example;

import org.jspecify.annotations.Nullable;

public class Main {

	public static void main(String[] args) {
		TokenExtractor extractor = new DefaultTokenExtractor();
		String @Nullable [] tokens = extractor.extractTokens("a,b,,d");
		if (tokens == null) {
			System.out.println("No tokens detected");
		}
		else {
			for (String token : tokens) {
				System.out.println("The token " + token + " has a length of " + token.length());
			}
		}
	}
}