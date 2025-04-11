package com.codekoro.tips.anonymous;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class LengthComparator implements Comparator<String> {

	@Override
	public int compare(String str1, String str2) {
		return Integer.compare(str1.length(), str2.length());
	}

}

public class AnonymousClassRunner {

	public static void main(String[] args) {
		List<String> haruhiCast = new ArrayList<String>(
				List.of("Kyo", "Nagato", "Asahina", "Haruhi"));
		Collections.sort(haruhiCast);
		System.out.println(haruhiCast);
		Collections.sort(haruhiCast, new LengthComparator());
		System.out.println(haruhiCast);
		Comparator<String> reverseLengthComparator = new Comparator<String>() {
			@Override
			public int compare(String str1, String str2) {
				return Integer.compare(str2.length(), str1.length());
			}

		};
		Collections.sort(haruhiCast, reverseLengthComparator);
		System.out.println(haruhiCast);
	}

}
