package org.example;

public class Main {

	public static void main(String[] args) {
		TokenExtractor extractor = new DefaultTokenExtractor();
		String token = extractor.extractToken("...");
		if (token == null) {
			System.out.println("No token");
		}
		else {
			System.out.println("The token has a length of " + token.length());
		}
	}
}