package com.codekoro.oops.level2;

public class Recipe1 extends AbstractRecipe{

	@Override
	void getReady() {
		System.out.println("Get raw matrerials");
		System.out.println("Get utensils");

	}

	@Override
	void doTheDish() {
		// TODO Auto-generated method stub
		System.out.println("Do the dish.");
	}

	@Override
	void cleanup() {
		System.out.println("Clean up");

	}

}
