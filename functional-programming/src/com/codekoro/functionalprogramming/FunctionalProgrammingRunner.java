package com.codekoro.functionalprogramming;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FunctionalProgrammingRunner {

	public static void main(String[] args) {
		List<String> list = List.of("apple", "banana", "cat", "fish", "bat");
		printBasic(list);
		printWithFP(list);
		printWithFPFiltering(list);
	}

	private static void printBasic(List<String> list) {
		for (String item : list) {
			System.out.println(item);
		}
	}

	private static void printWithFP(List<String> list) {
		list.stream().forEach(
					element -> System.out.println("element: " + element)
				);
	}

	private static void printWithFPFiltering(List<String> list) {
		System.out.println("\nPrinting with filtering Functional:");
		list.stream().filter(element -> element.endsWith("at")).forEach(
					element -> System.out.println("element: " + element)
				);
	}

    public static List<Integer> filterOddNumbers(List<Integer> numbers) {
        return numbers.stream().filter(e -> Math.abs(e)%2 == 1).collect(Collectors.toList());
    }

    public static List<Integer> getCubesOfFirstNNumbers(int n) {
        return IntStream.range(1, n+1)
                        .map(e -> e*e*e)
                        .boxed()
                        .collect(Collectors.toList());
    }

    public static long sumOfSquares(List<Integer> numbers) {
        // Check if the list is null. If so, return 0.
        if (numbers == null) {
            return 0;
        }
        // Stream over the list of numbers, find squares and sum them up
        return numbers.stream()
                      .mapToLong(e -> (long)Math.pow(e,2))
                      .sum();
    }

}
