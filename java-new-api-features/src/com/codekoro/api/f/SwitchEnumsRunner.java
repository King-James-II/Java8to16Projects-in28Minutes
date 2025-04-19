package com.codekoro.api.f;

import java.time.DayOfWeek;

public class SwitchEnumsRunner {

	public static void main(String[] args) {
		DayOfWeek dayOfWeek = DayOfWeek.SUNDAY;

		String str = switch(dayOfWeek) {
		case MONDAY -> "First Day of the work week!";
		case TUESDAY, WEDNESDAY, THURSDAY -> "Middle of the work week!";
		case FRIDAY -> "Last Day of the work week!";
		case SATURDAY, SUNDAY -> "Weekend";
		};

		System.out.println(str);
	}

}
