package com.codekoro.oops.level2.interfaces;

public class Project {

	interface Test {
		void nothing();
		default void nothing1() {

		}
	}

	class Class1 implements Test{
		@Override
		public void nothing() {

		}
	}

	class Class2 implements Test{
		@Override
		public void nothing() {

		}
	}

	public static void main(String[] args) {
		ComplexAlgorithm algorithm = new DummyAlgorithm();
		System.out.println(algorithm.complexAlgorithm(10, 20));
		 algorithm = new RealAlgorithm();
		System.out.println(algorithm.complexAlgorithm(10, 20));
	}

}
