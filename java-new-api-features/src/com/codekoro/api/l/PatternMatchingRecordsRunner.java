package com.codekoro.api.l;

record Customer (String name, String email) {}
record Product (String name, double price) {}
record Order (Customer customer, Product product) {}

public class PatternMatchingRecordsRunner {

	public static void processOrder(Object obj) {
		if (obj instanceof Order(
				Customer(String name, String email),
				Product(String productName, double price))) {
			System.out.println("Customer " + name + " ordered " + productName + " for $" + price);
		}
	}

	public static void main(String[] args) {
		processOrder(new Order(
				new Customer("Sora", "sora@kh.com"),
				new Product("Ultima Weapon", 1000)));
	}

}
