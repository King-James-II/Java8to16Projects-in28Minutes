package com.codekoro.api.e;

import java.util.List;

public class TypeInferencesRunner {

	public static void main(String[] args) {
		List<String> names1 = List.of("Tohru, Yuki, Kyo, Shigure, Akito, Hatsuharu, Momiji, Hatori");
		List<String> names2 = List.of("Ayame, Ritsu, Kagura, Kisa, Hiro, Kureno, Saki, Arisa");
		var var = "";

//		List<List<String>> names = List.of(names1,names2);
		var names = List.of(names1,names2);
//		names.stream1().forEach(System.out::println);

		for (var name : names1) {
			System.out.println(name);
		}
		List.of("testing", "testing12", "test", "a").stream().filter(s -> s.length() > 4).forEach(System.out::println);;

	}

}
