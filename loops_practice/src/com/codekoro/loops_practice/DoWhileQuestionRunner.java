package com.codekoro.loops_practice;

import java.util.Scanner;

public class DoWhileQuestionRunner {
	public static void main(String[] args) {
		int input = -1;
		do {
			if (input != -1) {
				System.out.println("Cube is " + input * input * input);
			}
			System.out.print("Enter a number: ");
			Scanner scanner = new Scanner(System.in);
			input = scanner.nextInt();

		}while(input >= 0);
		System.out.println("Thank You! Have Fun!");

	}
}
