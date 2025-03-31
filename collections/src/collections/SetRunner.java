package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

	public static void main(String[] args) {
		List<Character> characters = List.of('A', 'Z', 'W', 'A', 'C', 'O', 'X', 'S', 'R');

		// unique set in alphabetical order = TreeSet
		Set<Character> treeSet = new TreeSet<>(characters);
		System.out.println(treeSet);

		//unique set and keep original order = LinkedHashSet
		Set<Character> linkedHash = new LinkedHashSet<>(characters);
		System.out.println(linkedHash);

		//unique set no particular order = HashSet
		Set<Character> hashSet = new HashSet<>(characters);
		System.out.println(hashSet);
	}

}
