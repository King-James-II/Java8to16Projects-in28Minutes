class Task1 extends Thread {
	@Override
	public void run() {
		System.out.println("\nTask 1 Started");
		for(int i = 101; i <199; i++) {
			System.out.print(i + " ");
		}
		Thread.yield();
		System.out.println("\nTask 1 Done");
	}
}

class Task2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("\nTask 2 Started");
		for(int i = 201; i <299; i++) {
			System.out.print(i + " ");
		}
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\nTask 2 Done");
	}

}

public class ThreadBasicsRunner {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Task 1
		System.out.println("\nTask 1 Kicked Off");
		Task1 task1 = new Task1();
		task1.start();
		task1.setPriority(1);

		// Task 2
		System.out.println("\nTask 2 Kicked Off");
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		task2Thread.setPriority(10);
		task2Thread.start();

		// wait for task 1 to complete
		task1.join();

		// Task 3
		System.out.println("\nTask 3 Kicked Off");
		for(int i = 301; i <399; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\nTask 3 Done");
		System.out.println("\nMain Done");
	}
}