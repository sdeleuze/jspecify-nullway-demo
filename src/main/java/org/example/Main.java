package org.example;

import org.jspecify.annotations.Nullable;

public class Main {

	public static void main(String[] args) {
		TokenExtractor extractor = new DefaultTokenExtractor();
		Wrapper<@Nullable String> wrapper = extractor.extractToken("...");
		String token = wrapper.unwrap();
		if (token == null) {
			System.out.println("No token");
		}
		else {
			System.out.println("The token has a length of " + token.length());
		}
	}
}