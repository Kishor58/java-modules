package Java8Features;

public class Lamda_Expression_Example {

    public static void main(String[] args) {

        Calculator add=(a,b)->a+b;
        Calculator sub=(a,b)->a-b;

        System.out.println(add.calculator(5,4));
        System.out.println(sub.calculator(23,12));

    }
}

interface Calculator{
    int calculator(int a,int b);
}
