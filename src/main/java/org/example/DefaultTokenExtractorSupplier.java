package org.example;

import java.util.function.Supplier;

import org.jspecify.annotations.Nullable;

public class DefaultTokenExtractorSupplier implements TokenExtractorSupplier {

	@Override
	public Supplier<@Nullable TokenExtractor> getSupplier() {
		return () -> null;
	}
}
