package com.codekoro;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		int[] marks = {99, 79, 88, 93, 90, 100, 79};
		Student student = new Student("Clay", 99, 79, 88, 93, 90, 100, 79);
		int number = student.getNumberOfMarks();
		System.out.println("number of marks: " + number);
		int sum = student.getTotalSumOfMarks();
		System.out.println("sum of marks: " + sum);
		int maxMark = student.getMaximumMark();
		System.out.println("highest mark: " + maxMark);
		int minMark = student.getMinimumMark();
		System.out.println("lowest mark: " + minMark);
		BigDecimal average = student.getAverageMarks();
		System.out.println("average of marks: " + average);
		System.out.println(student);
		student.addNewMark(88);
		System.out.println(student);
		student.removeMarkAtIndex(0);
		System.out.println(student);

	}

}
