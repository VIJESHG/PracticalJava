
class Counter {
    private int count = 0;

    // Synchronized method to ensure thread-safe operations
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class _34_ThreadSynchronization {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        // Create two threads that will modify the counter
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        // Start the threads
        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        thread1.join();
        thread2.join();

        // Print the final count value
        System.out.println("Final count: " + counter.getCount());
    }
}