package MultiThreading;

public class RunnableInterfaceUse implements Runnable{
    public void run() {
        System.out.println("Sending confirmation email...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Email sending interrupted");
        }
        System.out.println("Email sent.");
    }

    public static void main(String[] args) {
        Runnable emailTask = new RunnableInterfaceUse();
        Thread thread = new Thread(emailTask);
        thread.start();
        System.out.println("Order placed successfully.");
    }
}
