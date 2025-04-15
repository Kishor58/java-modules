package Basic;

import java.util.Scanner;

public class BasicsOperations {
    public static void add(){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println("a + b :"+a+b);
    }
    public static void main(String[] args) {
     add();
    }
}
