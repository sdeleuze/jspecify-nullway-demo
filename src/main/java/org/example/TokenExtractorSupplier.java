package org.example;

import java.util.function.Supplier;

import org.jspecify.annotations.Nullable;

public interface TokenExtractorSupplier {

	Supplier<@Nullable TokenExtractor> getSupplier();
}
