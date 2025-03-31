package com.codekoro.functionalprogramming;

import java.util.List;
import java.util.stream.IntStream;

public class FPNumberRunner {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(13, 17, 5, 21, 69, 28, 1, 2 , 3, 4, 5, 6, 7, 8, 9, 0);
		List<String> words = List.of("Apple", "baT", "CAT", "doGe");

		System.out.println("+=======+");
		int fPSum = fPSum(numbers);
		int sum = normalSum(numbers);
		System.out.println(fPSum);
		System.out.println(fPSumWFilter(numbers));
		System.out.println(sum);
		fPSquareTen(numbers);
		mapToLower(words);
		printLengths(words);
	}

	private static int fPSum(List<Integer> numbers) {
		return numbers.stream().reduce(0, (num1, num2) -> {
								System.out.println(num1 + " " +  num2);
								return num1 + num2;
								}
						);
	}

	private static int fPSumWFilter(List<Integer> numbers) {
		return numbers.stream().filter(element -> element %2 == 1).reduce(0, (num1, num2) -> num1 + num2);
	}

	private static int normalSum(List<Integer> numbers) {
		int sum = 0;
		for (int number: numbers) {
			sum += number;
		}
		return sum;
	}

	private static void fPSquareTen(List<Integer> numbers) {
		IntStream.range(1,11).map(e -> e*e).forEach(e -> System.out.println(e));
	}

	private static void mapToLower(List<String> words) {
		words.stream()
			.map(e -> e.toLowerCase())
			.forEach(System.out::println);
	}

	private static void printLengths(List<String> words) {
		words.stream()
		.map(e -> e.length())
		.forEach(System.out::println);

	}

}
