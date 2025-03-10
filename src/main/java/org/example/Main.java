package org.example;

import java.util.ArrayList;
import java.util.List;

import org.jspecify.annotations.Nullable;

public class Main {

	public static void main(String[] args) {
		List<@Nullable String> listOfNullable = new ArrayList<>();
		listOfNullable.add("foo");
		listOfNullable.add(null);
		listOfNullable.add("bar");
		for (String element : listOfNullable) {
			System.out.println(element.toLowerCase());
		}
	}
}