// ThreadT1.java
class ThreadT1 extends Thread {
    public void run() {
        while (!isInterrupted()) {
            System.out.println("Thread T1: Thread 1");
            try {
                Thread.sleep(1000); // Sleeping for 1 second
            } catch (InterruptedException e) {
                interrupt(); // Set the interrupt flag when an InterruptedException is caught
            }
        }
    }
}