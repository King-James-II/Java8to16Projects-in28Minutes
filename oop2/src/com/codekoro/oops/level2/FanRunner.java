package com.codekoro.oops.level2;

public class FanRunner {
	public static void main(String[] args) {
		Fan fan = new Fan("Holmes Products Corp", 0.34567, "green");
		fan.switchOn();
		System.out.println(fan);
		fan.setSpeed((byte)7);
		System.out.println(fan);
		fan.switchOff();
		System.out.println(fan);

	}
}
