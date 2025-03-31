package com.codekoro.loops_practice;

public class WhileNumberPlayer {


	private int limit;

	public WhileNumberPlayer(int number) {

		this.limit = number;
	}

	public void printSquaresToLimit() {
		int i = 0;
		while (i*i <= limit) {
			System.out.print(i * i + " ");
			i++;
		}
		System.out.println(" ");

	}

	public void printCubesToLimit() {
		int i = 0;
		while (i*i*i <= limit) {
			System.out.print(i * i * i + " ");
			i++;
		}
		System.out.println(" ");
	}

}
