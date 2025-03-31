package com.codekoro.loops_practice;

public class MyNumberRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyNumber number = new MyNumber(9);
		boolean isPrime = number.isPrime();
		System.out.println(isPrime);
		int sum = number.sumUPtoN();
		System.out.println(sum);
		int sumOfDiv = number.sumOfDivisors();
		System.out.println(sumOfDiv);
		number.printANumberTriangle();
	}

}

