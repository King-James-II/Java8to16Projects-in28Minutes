package com.codekoro.oops.level2;

public class Fan {
	private String make;
	private double radius;
	private String color;
	private boolean isOn;
	private byte speed;

	public Fan(String make, double radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;
	}

	public void switchOn() {
		this.isOn= true;
		this.setSpeed((byte)5);;
	}

	public void switchOff() {
		this.isOn= false;
		this.setSpeed((byte)0);;
	}

	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(byte speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return String.format("Fan [make=%s, radius=%s, color=%s, isOn=%s, speed=%s]", make, radius, color, isOn, speed);
	}





}
