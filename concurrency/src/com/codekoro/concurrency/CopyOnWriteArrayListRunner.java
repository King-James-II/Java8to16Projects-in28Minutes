package com.codekoro.concurrency;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListRunner {

	// copies array on array only for concurrency and fast reading.

	public static void main(String[] args) {
		List<String> list = new CopyOnWriteArrayList<>();

		// Threads 4
		list.add("Ichigo");
		list.add("Rukia");
		list.add("Hitsugaya");
		list.add("Matsumoto");

		// Threads 10000
		for (String element: list) {
			System.out.println(element);
		}
	}

}
