package com.codekoro;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {
	private String studentName;
	private ArrayList<Integer> studentMarks = new ArrayList<Integer>();

	public Student(String name, int... marks) {
		this.studentName = name;
		for (int mark : marks) {
			this.studentMarks.add(mark);
		}
	}

	public int getNumberOfMarks() {
		return studentMarks.size();
	}

	public int getTotalSumOfMarks() {
		int sum = 0;
		for (int num : studentMarks) {
			sum += num;
		}
		return sum;
	}

	public int getMaximumMark() {
		return Collections.max(studentMarks);
	}

	public int getMinimumMark() {
		return Collections.min(studentMarks);
	}

	public BigDecimal getAverageMarks() {
		BigDecimal sum = new BigDecimal(getTotalSumOfMarks());
		BigDecimal numMarks = new BigDecimal(getNumberOfMarks());
		return  sum.divide(numMarks, 2, RoundingMode.UP);
	}

	@Override
	public String toString() {
		return studentName + studentMarks;
	}

	public void addNewMark(int mark) {
		studentMarks.add(mark);
	}

	public void removeMarkAtIndex(int index) {
		studentMarks.remove(index);
	}


}
