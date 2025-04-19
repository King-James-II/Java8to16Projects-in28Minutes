package com.codekoro.api.g;

public class TextBlockRunner {

	public static void main(String[] args) {
		String str1 = """
				LoL""";
		String str = """
				"Riven"
					Zoe
					Garen
						"Lux"
							Rumble
				Rakan
				""";

		String textBlock = """
				Riven: %s
				Nasus: %s
				Yasuo: %s
				Lux: %s""".formatted("What is broken can be reforged.", "Honor is in the heart, "
						+ "not in the name.", "The strongest light is the one within.", "The cycle"
								+ " of life and death continues. We will live, they will die.");

		System.out.println(str1);
		System.out.println(str);
		System.out.println(textBlock);

	}

}
