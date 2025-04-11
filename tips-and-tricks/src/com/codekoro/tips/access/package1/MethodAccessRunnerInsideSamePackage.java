package com.codekoro.tips.access.package1;

public class MethodAccessRunnerInsideSamePackage{

	public static void main(String[] args) {
		ExampleClass exampleClass = new ExampleClass();
		exampleClass.privateMethod();
		exampleClass.publicMethod();
		exampleClass.defaultMethod();
		exampleClass.protectedMethod();
	}

}
