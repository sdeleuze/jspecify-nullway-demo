package org.example;

import org.springframework.util.Assert;

public class Main {

	public static void main(String[] args) {
		TokenExtractor extractor = new DefaultTokenExtractor();
		String token = extractor.extractToken("...");
		Assert.state(token != null, "In theory, that should not happen!");
		System.out.println("The token has a length of " + token.length());
	}
}