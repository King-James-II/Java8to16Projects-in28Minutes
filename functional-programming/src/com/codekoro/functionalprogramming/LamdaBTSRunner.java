package com.codekoro.functionalprogramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class EvenNumberPredicate implements Predicate<Integer> {
	@Override
	public boolean test(Integer number) {
		return number%2 == 0;
	}
}

class SystemOutConsumer implements Consumer<Integer> {
	@Override
	public void accept(Integer number) {
		System.out.println(number);
	}
}

class NumberSquareMapper implements Function <Integer, Integer> {
	@Override
	public Integer apply(Integer number) {
		return number * number;
	}
}

public class LamdaBTSRunner {


	public static void main(String[] args) {

		Predicate<? super Integer> evenPredicate = createEvenPredicate();
		Predicate<? super Integer> oddPredicate = createEvenPredicate();

		List.of(23,82,69, 43, 11, 34 , 48, 36).stream()
			.filter(evenPredicate)
			.forEach(e ->System.out.println(e));
		List.of(23,82,69, 43, 11, 34 , 48, 36, 33).stream()
		.filter(new EvenNumberPredicate	())
		.map(new NumberSquareMapper())
		.forEach(new SystemOutConsumer());
	}

	private static Predicate<? super Integer> createEvenPredicate() {
		return n -> n%2 == 0;
	}

}
