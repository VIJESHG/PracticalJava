/**
 * This program demonstrates how to create and use threads in Java.
 * It shows:
 * 1. How to extend the Thread class to create a thread.
 * 2. How to implement the Runnable interface to create a thread.
 * 3. How to start a thread, make it sleep, and join threads.
 */

 class MyThread extends Thread {
    @Override
    public void run() {
        // Task to be executed by the thread
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running - Count: " + i);
            try {
                Thread.sleep(1000); // Pauses the thread for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        // Task to be executed by the thread
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running - Count: " + i);
            try {
                Thread.sleep(1000); // Pauses the thread for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class _33_ThreadsBasic{
    public static void main(String[] args) throws InterruptedException {

        // Creating and starting a thread by extending Thread class
        MyThread thread1 = new MyThread();
        thread1.setName("Thread-1");
        thread1.start(); // Start the thread

        // Creating and starting a thread by implementing Runnable interface
        MyRunnable runnable = new MyRunnable();
        Thread thread2 = new Thread(runnable);
        thread2.setName("Thread-2");
        thread2.start(); // Start the thread

        // Wait for both threads to finish
        thread1.join();
        thread2.join();

        System.out.println("Main thread finished.");
    }
}