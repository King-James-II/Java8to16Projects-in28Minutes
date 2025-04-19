package com.codekoro.api.c;

import java.util.List;
import java.util.function.Predicate;

public class PredicateNotRunner {

	static boolean isEven(int number) {
		return number %2 == 0;
	}

	public static void main(String[] args) {
		List<Integer> numbers = List.of(3, 4, 7, 11, 128, 17);
//		Predicate<Integer> evenNumberPredicate = number -> number %2 == 0;
//		numbers.stream().filter(evenNumberPredicate.negate()).forEach(System.out::println);;
		numbers.stream().filter(Predicate.not(PredicateNotRunner::isEven))
						.forEach(System.out::println);
	}

}
