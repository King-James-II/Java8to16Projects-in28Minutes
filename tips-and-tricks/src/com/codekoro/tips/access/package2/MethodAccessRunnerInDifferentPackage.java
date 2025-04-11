package com.codekoro.tips.access.package2;

import com.codekoro.tips.access.package1.ExampleClass;

public class MethodAccessRunnerInDifferentPackage{

	public static void main(String[] args) {
		ExampleClass exampleClass = new ExampleClass();
		exampleClass.privateMethod();
		exampleClass.publicMethod();
		exampleClass.defaultMethod();
		exampleClass.protectedMethod();
	}

}
