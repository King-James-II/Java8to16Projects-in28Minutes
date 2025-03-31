package com.codekoro.loops_practice;

public class MyNumber {

	private int number;

	public MyNumber(int number) {
		// TODO Auto-generated constructor stub
		this.number = number;
	}

	public boolean isPrime() {
		if (number < 2 ) {
			return false;
		}
		// TODO Auto-generated method stub
		for (int i = 2; i <= number-1; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public int sumUPtoN() {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			sum += i;
		}
		return sum;
	}

	public int sumOfDivisors() {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 2; i <= number-1; i++) {
			if (number % i == 0) {
				sum += i;
			}

		}
		return sum;
	}

	public void printANumberTriangle() {
		// TODO Auto-generated method stub
		String line = "";
		for (int i = 1; i <= number; i++) {
			line += (i + " ");
			System.out.println(line);
		}
	}

}
