package com.codekoro.functionalprogramming;

import java.util.List;
import java.util.stream.Collectors;

public class MethodReferencesRunner {

	public static void print(Integer str) {
		System.out.println(str);
	}

	public static void main(String[] args) {
			List.of("Apple", "Bat", "Cat", "Dog", "Elephant", "Frog").stream()
			.map(e -> e.length())
			.forEach(e -> System.out.println(e));

			List.of("Apple", "Bat", "Cat", "Dog", "Elephant", "Frog").stream()
			.map(e -> e.length())
			.forEach(System.out::println);

			List.of("Apple", "Bat", "Cat", "Dog", "Elephant", "Frog").stream()
			.map(String:: length)
			.forEach(MethodReferencesRunner::print);

			Integer max = List.of(77, 11, 22, 33, 44).stream()
			.filter(MethodReferencesRunner:: isEven)
			.max(Integer::compare)
			.orElse(0);

			System.out.println(max);
	}

	public static boolean isEven(Integer num) {
		return num %2 == 0;
	}

    public static List<Integer> getCourseNameCharacterCount(List<String> courses) {
        if (courses == null) {
            return List.of();
        }
        return courses.stream()
                    .map(String::length)
                    .collect(Collectors.toList());
    }

    public static int findMaxEvenNumber(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }
        return numbers.stream()
               .filter(n -> n % 2 == 0)
               .max(Integer::compare)
               .orElse(0);
    }

}
