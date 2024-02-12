// MainThreadExample.java
public class MainThreadExample {
    public static void main(String[] args) {
        // Creating and starting a thread from class T1
        ThreadT1 t1 = new ThreadT1();
        t1.start();

        try {
            // Waiting for 5 seconds
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Creating and starting a thread from class T2
        Thread t2 = new Thread(new ThreadT2());
        t2.start();

        try {
            // Waiting for 5 seconds
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Stopping thread from class T1
        t1.interrupt();

        try {
            // Waiting for 5 seconds
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Stopping thread from class T2
        t2.interrupt();
    }
}