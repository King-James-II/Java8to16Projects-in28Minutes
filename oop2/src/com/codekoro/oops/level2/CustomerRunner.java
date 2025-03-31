package com.codekoro.oops.level2;

public class CustomerRunner {
	public static void main(String[] args) {
		Address homeAddress = new Address("123 Apple St", "Dallas", "98765");
		Address workAddress = new Address("9875 Orange St", "Timbukto", "12345");
		Customer customer = new Customer("Crocket", homeAddress);
		customer.setWorkAddress(workAddress);

		System.out.println(customer);
	}
}
