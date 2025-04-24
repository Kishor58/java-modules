package MultiThreading;

public class SleepMethodExample02 extends Thread{
    public void run(){
        String str="Welcome to the WCS";

        String[] str1=str.split(" ");
        for(int i=0;i<str1.length;i++){
            System.out.println(str1[i]+" "+"...");
            try {
                Thread.sleep(2000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
       SleepMethodExample02   sleep=new SleepMethodExample02();

       sleep.start();
    }
}
