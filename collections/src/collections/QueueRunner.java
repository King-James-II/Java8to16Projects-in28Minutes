package collections;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String val1, String val2) {
		return Integer.compare(val1.length(), val2.length());
	}

}

public class QueueRunner {

	public static void main(String[] args) {
		// Natural Order
		System.out.println("Natural Order:\n");
		Queue<String> queue = new PriorityQueue<>();
		queue.addAll(List.of("Link", "Mario", "Ness", "Pikachu", "Luigi", "Donkey Kong"));
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());

		System.out.println("\nOrder by Characters in name length:\n");

		Queue<String> queue2 = new PriorityQueue<>(new StringLengthComparator());
		queue2.addAll(List.of("Link", "Mario", "Ness", "Pikachu", "Luigi", "Donkey Kong"));
		System.out.println(queue2.poll());
		System.out.println(queue2.poll());
		System.out.println(queue2.poll());
		System.out.println(queue2.poll());
		System.out.println(queue2.poll());
		System.out.println(queue2.poll());
	}

}
