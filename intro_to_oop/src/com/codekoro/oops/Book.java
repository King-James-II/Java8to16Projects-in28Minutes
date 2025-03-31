package com.codekoro.oops;

public class Book {
	private String name = "";
	private int numOfCopies = 0;

	public Book(String name, int numOfCopies) {
		super();
		this.name = name;
		this.numOfCopies = numOfCopies;
	}

	public Book () {

	}
	void read() {
		System.out.println("Reading " + this.name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumOfCopies() {
		return numOfCopies;
	}
	public void setNumOfCopies(int numOfCopies) {
		this.numOfCopies = numOfCopies;
	}

	public void checkInBook(int num) {
		this.numOfCopies += num;
	}

	public void checkOutBook(int num) {
		this.numOfCopies -= num;
	}

}
