import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * This example demonstrates the use of a ScheduledThreadPool.
 * A ScheduledThreadPool allows tasks to be scheduled for execution at a fixed rate
 * or with a fixed delay. This is useful for tasks that need to run periodically or with delays.
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

public class _38_ScheduledThreadPool {
    public static void main(String[] args) {
        // Create a ScheduledThreadPool with 2 threads
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);

        // Schedule tasks with a fixed delay
        scheduler.scheduleWithFixedDelay(new Task(1), 0, 2, TimeUnit.SECONDS);
        scheduler.scheduleWithFixedDelay(new Task(2), 0, 3, TimeUnit.SECONDS);
        scheduler.scheduleWithFixedDelay(new Task(3), 0, 1, TimeUnit.SECONDS);

        // Let the tasks run for some time before shutting down
        try {
            Thread.sleep(10000); // Let the tasks run for 10 seconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Shut down the scheduler after tasks are completed
        scheduler.shutdown();
    }
}