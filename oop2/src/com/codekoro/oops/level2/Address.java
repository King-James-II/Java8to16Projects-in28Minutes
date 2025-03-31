package com.codekoro.oops.level2;

public class Address {
	private String line1;
	private String city;
	private String zip;

	public Address(String line1, String city, String zip) {
		this.line1 = line1;
		this.city = city;
		this.zip = zip;
	}

	@Override
	public String toString() {
		return String.format("Address [line1=%s, city=%s, zip=%s]", line1, city, zip);
	}


}
