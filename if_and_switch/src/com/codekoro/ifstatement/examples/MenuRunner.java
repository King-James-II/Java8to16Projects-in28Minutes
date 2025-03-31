package com.codekoro.ifstatement.examples;

import java.util.Scanner;

public class MenuRunner {

	private static double solution = 0;

	public static void main(String[] args) {
		int option = 0;
		while (option != 5) {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter Number 1: ");
			int number1 = input.nextInt();
			System.out.println(number1);
			System.out.print("Enter Number 2: ");
			int number2 = input.nextInt();
			System.out.println(number2);

			System.out.println("1 - Add \n2 - Subtract\n3 - Divide\n4 - Multiply\n5 - Exit");
			System.out.print("Choose Operation: ");
			option = input.nextInt();
			if (option == 5) {
				System.out.print("Exiting.. ");
				break;
			}
			performOperationUsingSwitch(number1, number2, option);
		}
	}

	private static void performOperationUsingSwitch(int number1, int number2, int option) {
		switch(option) {
			case 1 :
				solution = number1 + number2;
				break;
			case 2 :
				solution = number1 - number2;
				break;
			case 3 :
				solution = number1 / number2;
				break;
			case 4 :
				solution = number1 * number2;
				break;
			default :
				System.out.println("Invalid Operation");
				break;
		}
		System.out.println("\nResult is - " + solution);
	}
}
