import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * This example demonstrates the use of a SingleThreadExecutor.
 * A SingleThreadExecutor ensures that only one task is executed at a time,
 * and tasks are executed sequentially in the order they are submitted.
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

public class _37_SingleThreadExecutor {
    public static void main(String[] args) {
        // Create a SingleThreadExecutor to execute tasks sequentially
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        // Submit 5 tasks to the executor
        for (int i = 1; i <= 5; i++) {
            executorService.submit(new Task(i));
        }

        // Gracefully shut down the executor
        executorService.shutdown();
    }
}