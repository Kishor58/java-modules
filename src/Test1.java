import java.util.Scanner;

public class Test1 {
    public static void add(int a,int b){
        System.out.println("a + b :"+(a+b));
    }
    public static  void subtract(int a,int b){
        System.out.println("a - b :"+ (a-b));
    }
    public static void multiply(int a,int b){
        System.out.println("a * b :"+ a*b );
    }
    public static void divide(int a, int b){
        System.out.println("a / b :"+ a/b );
    }
    public static int square(int a){
        int squar=a*a;
        return squar;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter First Value :");
        int a=sc.nextInt();
        System.out.println("Enter Second value :");
        int b=sc.nextInt();

        add(a,b);
        subtract(a,b);
        multiply(a,b);
        divide(a,b);
        System.out.println("Enter the a number which you want to square");
        int c=sc.nextInt();
        System.out.println("Square Of the Given Number :"+square(c));

    }
}
