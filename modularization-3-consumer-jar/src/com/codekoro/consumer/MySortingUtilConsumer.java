package com.codekoro.consumer;

import java.util.List;
import java.util.logging.Logger;

import com.codekoro.sorting.util.MySortingUtil;

public class MySortingUtilConsumer {
	public static void main(String args[]) {

		Logger logger = Logger.getLogger(MySortingUtilConsumer.class.getName());

		MySortingUtil util = new MySortingUtil();
		List<String> sorted = util.sort(List.of("Axel", "Xemnas", "Roxas", "Demyx", "Larxene", "Marluxia", "Luxord", "Xion", "Xaldin", "Xigbar", "Vexen", "Lexaeus", "Zexion", "Saix"	));
		logger.info(sorted.toString());
	}
}
