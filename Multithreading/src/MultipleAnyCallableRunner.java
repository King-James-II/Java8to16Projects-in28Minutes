import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleAnyCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(3);

		List<CallableTask> tasks = List.of(new CallableTask("Code Koro"), new CallableTask("Ash"),
				new CallableTask("Misty"), new CallableTask("Brock"));

		String result = executorService.invokeAny(tasks);

		System.out.println(result);

		executorService.shutdown();
	}

}
