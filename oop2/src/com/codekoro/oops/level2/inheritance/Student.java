package com.codekoro.oops.level2.inheritance;

public class Student extends Person{
	private String college;
	private int year;

	public Student(String name, String collegeName) {
		super(name);
		this.college = collegeName;
	}

	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return String.format("Student [name=%s, email=%s, phoneNumber=%s, college=%s, year=%s]", getName(), getEmail(), getPhoneNumber(), this.college, this.year);
	}



}
