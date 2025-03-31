package com.in28minutes.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericsRunner {

	static <X> X doubleValue(X value) {
		return value;
	}

	static double sumOfNumberList(List<? extends Number> numbers) {
		double sum = 0.0;
		for (Number number: numbers) {
			sum += number.doubleValue();
		}
		return sum;
	}

	static void addACoupleValues(List<? super Number> numbers) {
		numbers.add(1);
		numbers.add(7.3);
		numbers.add(6.9f);
		numbers.add(5l);

	}

	static <X extends List> void duplicate(X list) {
		list.addAll(list);

	}

	public static void main(String[] args) {
		List emptyList = new ArrayList<Number>();
		addACoupleValues(emptyList);
		System.out.println(emptyList);

		System.out.println(sumOfNumberList(List.of(10,5,3,2,1)));
		System.out.println(sumOfNumberList(List.of(10.3,5.1,3.0,2.3,1.9)));
		System.out.println(sumOfNumberList(List.of(10l,5l,3l,2l,1l)));

		MyCustomList<String> list = new MyCustomList();
		list.addElement("Element 1");
		list.addElement("Element 2");
		System.out.println(list);
		String value = list.get(0);
		System.out.println(value);

		MyCustomList<Integer> list2 = new MyCustomList();
		list2.addElement(Integer.valueOf(45));
		list2.addElement(Integer.valueOf(35));
		System.out.println(list2);
		Integer number = list2.get(0);
		System.out.println(number);

		ArrayList<Integer> numbers = new ArrayList<>(List.of(1,2,3,4,5));
		duplicate(numbers);
		System.out.println(numbers);
		LinkedList<Integer> linkedNumbers = new LinkedList<>(List.of(10,9,8,7,6));
		duplicate(linkedNumbers);
		System.out.println(linkedNumbers);
	}

}
