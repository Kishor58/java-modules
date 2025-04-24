package MultiThreading;

public class ThreadClassUse extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Uploading... " + (i * 20) + "%");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Upload interrupted");
            }
        }
        System.out.println("Upload complete.");
    }

    public static void main(String[] args) {
        ThreadClassUse upload = new ThreadClassUse();
        upload.start();
    }
}
