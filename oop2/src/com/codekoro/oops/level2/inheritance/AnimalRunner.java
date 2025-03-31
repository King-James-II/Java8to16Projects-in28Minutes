package com.codekoro.oops.level2.inheritance;

abstract class Animal {
	abstract void speak();
}

class Dog extends Animal {
	@Override
	public void speak() {
		System.out.println("Bark bark");
	}
}

class Cat extends Animal {
	@Override
	public void speak() {
		System.out.println("Mew");
	}
}

public class AnimalRunner {

	public static void main(String[] args) {
		Animal[] animals = {new Dog(), new Cat()};

		for (Animal animal : animals ) {
			animal.speak();
		}
	}

}
