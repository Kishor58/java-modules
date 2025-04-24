package MultiThreading;

public class MultiThreadExample1 {
    public static void main(String[] args) {
        myThread t=new myThread();
        t.start();
        for(int i=0;i<100;i++){
            System.out.println("Main Thread");
        }
    }
}
class myThread extends Thread {
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Child Thread");
        }
    }
}
