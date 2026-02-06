package advanced;

/**
 * Multithreading - Demonstrates basic multithreading concepts
 * Concepts: Thread class, Runnable interface, synchronized
 */
public class Multithreading {
    public static void main(String[] args) {
        System.out.println("Main thread: " + Thread.currentThread().getName());
        
        // Creating thread by extending Thread class
        MyThread thread1 = new MyThread("Thread-1");
        thread1.start();
        
        // Creating thread by implementing Runnable
        Thread thread2 = new Thread(new MyRunnable("Thread-2"));
        thread2.start();
        
        // Using lambda for Runnable
        Thread thread3 = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Lambda Thread: Count " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread3.start();
        
        // Synchronized example
        System.out.println("\nSynchronized example:");
        Counter counter = new Counter();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                counter.increment();
            }
        });
        
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                counter.increment();
            }
        });
        
        t1.start();
        t2.start();
        
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Final count: " + counter.getCount());
    }
}

// Thread by extending Thread class
class MyThread extends Thread {
    private String name;
    
    public MyThread(String name) {
        this.name = name;
    }
    
    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(name + ": Count " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Thread by implementing Runnable
class MyRunnable implements Runnable {
    private String name;
    
    public MyRunnable(String name) {
        this.name = name;
    }
    
    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(name + ": Count " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Synchronized counter
class Counter {
    private int count = 0;
    
    public synchronized void increment() {
        count++;
        System.out.println("Count incremented to: " + count);
    }
    
    public int getCount() {
        return count;
    }
}
