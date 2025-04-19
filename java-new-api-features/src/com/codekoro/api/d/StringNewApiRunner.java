package com.codekoro.api.d;

class SampleClass{
	String str = null;
}

public class StringNewApiRunner {

	public static void main(String[] args) {
		System.out.println("   ".isBlank());
		System.out.println(" skj df23 ".strip().replace(" ", "♥"));
		System.out.println(" skjsdfassddf23s ".stripLeading().replace(" ", "♥"));
		System.out.println(" vaeee ".stripTrailing().replace(" ", "♥"));
		"Rukia\nIchigo\nAizen\nHitsugaya\nMatsumoto\nIchimaru ".lines().forEach(System.out::println);

		System.out.println("UPPER".transform(s -> s.substring(2)));
		System.out.println("My name is %s My age is %d".formatted("King Mickey", 97));

		SampleClass sample = new SampleClass();
		String str = null;
		System.out.println(sample.str.isBlank());

//		Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.isBlank()" because "sample.str" is null
//		at com.codekoro.api.d.StringNewApiRunner.main(StringNewApiRunner.java:21)

//		Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.isBlank()" because "str" is null
//		at com.codekoro.api.d.StringNewApiRunner.main(StringNewApiRunner.java:15)

	}

}
