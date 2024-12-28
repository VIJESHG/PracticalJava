import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * This example demonstrates the use of a FixedThreadPool.
 * A FixedThreadPool creates a pool of a fixed number of threads.
 * If there are more tasks than the number of threads in the pool,
 * the excess tasks are queued up until a thread becomes available.
 */
class Task implements Runnable {
    private final int taskId;

    public Task(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        System.out.println("Task " + taskId + " is being executed by " + Thread.currentThread().getName());
    }
}

public class _35_FixedThreadPool {
    public static void main(String[] args) {
        // Create a FixedThreadPool with 3 threads
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // Submit 5 tasks to the executor
        for (int i = 1; i <= 5; i++) {
            executorService.submit(new Task(i));
        }

        // Initiates an orderly shutdown of the executor
        executorService.shutdown();
    }
}