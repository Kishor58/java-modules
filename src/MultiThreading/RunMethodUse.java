package MultiThreading;

public class RunMethodUse implements Runnable {
    public void run() {
        System.out.println("Performing database cleanup...");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Cleanup interrupted");
        }
        System.out.println("Cleanup complete.");
    }

    public static void main(String[] args) {
        RunMethodUse r1=new RunMethodUse();
        Thread cleanup = new Thread(r1);
        cleanup.start();
    }
}
