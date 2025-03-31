package com.codekoro.oops.level2;

public class RecipeWithMicrowave extends AbstractRecipe{

	@Override
	void getReady() {
		System.out.println("Get raw matrerials");
		System.out.println("Switch on Microwave");

	}

	@Override
	void doTheDish() {
		// TODO Auto-generated method stub
		System.out.println("get stuff ready");
		System.out.println("put it in the microwave");
	}

	@Override
	void cleanup() {
		System.out.println("Clean up");
		System.out.println("Switch off Microwave");

	}

}
