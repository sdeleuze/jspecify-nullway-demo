package org.example;

import org.jspecify.annotations.NullUnmarked;
import org.jspecify.annotations.Nullable;

public class Wrapper<T extends @Nullable String> {

	private final T value;

	@NullUnmarked
	public Wrapper(T value) {
		this.value = value;
	}

	T unwrap() {
		return value;
	}
}
