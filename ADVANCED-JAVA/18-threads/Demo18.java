class A extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("A");
            try {
                Thread.sleep(1);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class B {

}

class C extends B implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("C");
        }
    }
}

class Counter {
    int count;

    public synchronized void increment() {
        count++;
    }
}

public class Demo18 {
    public static void main(String[] args) {

        A a = new A(); // class extends Thread

        Runnable c = new C(); // class implements Runnable

        Runnable d = () -> { // lambda Runnable construction
            for (int i = 0; i < 5; i++) {
                System.out.println("D");
            }
        };

        a.setPriority(Thread.MAX_PRIORITY);
        a.start(); // start() execute the run method

        Thread t1 = new Thread(c); // construct a Thread from a Runnable
        t1.start();

        Thread t2 = new Thread(d);
        t2.start();

        // to work with multiple threads and mutable data you need a synchronized method

        Counter counter = new Counter();

        Runnable x = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        };
        Runnable y = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        };

        Thread xThread = new Thread(x);
        Thread yThread = new Thread(y);

        xThread.start();
        yThread.start();

        try {
            xThread.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        try {
            yThread.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println(counter.count);

    }
}