package com.codekoro.oops;

public class BookCreator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book artOfComputerProgramming = new Book();
		Book effectiveJava = new Book();
		Book cleanCode = new Book("Clean Code", 1);
		artOfComputerProgramming.read();
		System.out.println("Book1");
		effectiveJava.read();
		System.out.println("Book2");
		cleanCode.read();
		System.out.println(cleanCode.getNumOfCopies());
		cleanCode.checkInBook(1);
		System.out.println(cleanCode.getNumOfCopies());
		cleanCode.checkOutBook(2);
		System.out.println(cleanCode.getNumOfCopies());

	}

}
