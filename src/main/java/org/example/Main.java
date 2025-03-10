package org.example;

import java.util.function.Supplier;

import org.jspecify.annotations.Nullable;

public class Main {


	public static void main(String[] args) {
		Supplier<@Nullable TokenExtractor> supplier = new DefaultTokenExtractorSupplier().getSupplier();
		TokenExtractor extractor = supplier.get();
		String token = extractor.extractToken("...");
		if (token == null) {
			System.out.println("No token found");
		}
		else {
			System.out.println("The token has a length of " + token.length());
		}
	}
}