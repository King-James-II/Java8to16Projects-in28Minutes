package collections;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {

	public static void main(String[] args) {
		String message = "This is an awesome statement. No other statement is this good.";
		Map<Character, Integer> occurances = new HashMap<>();
		Map<String, Integer> wordOccurances = new HashMap<>();
		String[] words = message.split(" ");
		char[] chars = message.toCharArray();

		for (char c: chars) {
			Integer integer = occurances.get(c);
			if (integer == null) {
				occurances.put(c, 1);
			}
			else {
				occurances.put(c, integer +1);
			}
		}
		for (String word: words) {
			Integer integer = wordOccurances.get(word);
			if (integer == null) {
				wordOccurances.put(word, 1);
			}
			else {
				wordOccurances.put(word, integer +1);
			}
		}
		System.out.println(occurances);
		System.out.println(wordOccurances);
	}

}
