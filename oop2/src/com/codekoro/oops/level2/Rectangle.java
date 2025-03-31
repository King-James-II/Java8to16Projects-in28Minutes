package com.codekoro.oops.level2;

public class Rectangle {
	private int length;
	private int width;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int area() {
		return width * length;
	}

	public int perimeter() {
		return (length + width) * 2;
	}

	@Override
	public String toString() {
		return String.format("Rectangle [length=%d, width=%d, area=%d, perimeter=%d]", length, width, area(), perimeter());
	}


}
