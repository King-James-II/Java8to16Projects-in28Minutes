package com.codekoro.consumer;

import java.util.List;
import java.util.logging.Logger;

import com.codekoro.sorting.algorithm.BubbleSort;

public class DirectConsumer {
	public static void main(String args[]) {

		Logger logger = Logger.getLogger(DirectConsumer.class.getName());

		BubbleSort util = new BubbleSort();
		List<String> sorted = util.sort(List.of("Axel", "Xemnas", "Roxas", "Demyx", "Larxene", "Marluxia", "Luxord", "Xion", "Xaldin", "Xigbar", "Vexen", "Lexaeus", "Zexion", "Saix"	));
		logger.info(sorted.toString());
	}
}

