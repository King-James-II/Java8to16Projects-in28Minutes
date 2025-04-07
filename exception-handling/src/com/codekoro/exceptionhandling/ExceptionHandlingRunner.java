package com.codekoro.exceptionhandling;

public class ExceptionHandlingRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();
		System.out.println("Main ended.");
	}

	private static void method1() {
		method2();
		System.out.println("Method 2 ended.");
	}

	private static void method2() {
		String str = null;
		str.length();
		System.out.println("Method 1 ended.");
	}

}
