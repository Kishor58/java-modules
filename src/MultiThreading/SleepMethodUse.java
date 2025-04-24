package MultiThreading;

public class SleepMethodUse {
    public static void main(String[] args) {
        int maxRetries = 3;
        for (int i = 1; i <= maxRetries; i++) {
            System.out.println("Attempt " + i + ": Trying to connect...");
            try {

                Thread.sleep(1000); // wait before retry
                if (i == maxRetries) {
                    System.out.println("Service unavailable after retries.");
                }
            } catch (InterruptedException e) {
                System.out.println("Retry interrupted");
            }
        }
    }

}
