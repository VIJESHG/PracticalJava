import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * This example demonstrates the use of a CachedThreadPool.
 * A CachedThreadPool creates new threads as needed, but it will reuse 
 * previously created threads if they are idle and available.
 * This type of pool is suitable for handling a large number of short-lived tasks.
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

public class _36_CachedThreadPool {
    public static void main(String[] args) {
        // Create a CachedThreadPool that creates new threads as needed
        ExecutorService executorService = Executors.newCachedThreadPool();

        // Submit 5 tasks
        for (int i = 1; i <= 5; i++) {
            executorService.submit(new Task(i));
        }

        // Gracefully shuts down the executor after completion of tasks
        executorService.shutdown();
    }
}