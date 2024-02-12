// ThreadT2.java
class ThreadT2 implements Runnable {
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            System.out.println("Thread T2: Thread 2");
            try {
                Thread.sleep(1000); // Sleeping for 1 second
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Set the interrupt flag when an InterruptedException is caught
            }
        }
    }
}