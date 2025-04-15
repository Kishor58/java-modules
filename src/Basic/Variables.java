package Basic;

public class Variables {
    int a=10;
    static int b =20;
    String position ="Software Developer Trainee";
    static String role="Full stack Java Developer";

    public static void main(String[] args) {
        int a=200; //Primitive and Local Variable
        int b=100; //Primitive and Local Variable

        String company="WCS";

        Variables var=new Variables();

//      System.out.println("This is Globle non static  variable "+a );//It is given to us error because non static variable we can not be access directly

        System.out.println("Globle Non Static Variable :"+var.a); // To access the non static variable we must required Object of that class

//      System.out.println("Globle static Variable :"+ b); // if i have local variable with same name so it give the output of local variable value then how can i access my globle static variable for that i have to user ClassName.variableName

        System.out.println("Globle static Variable When Local & Globle Variable are same :" + Variables.b);

        System.out.println("This is Local variable :"+ b);   //it is local variable

        System.out.println("It is local variable only :"+ a);

        System.out.println("Company Name :"+company);

        System.out.println("Position :"+ var.position);

        System.out.println("Role :"+role);


    }
    {    //it is non static context (Instance Initializer Block (IIB) Note : This Block will excute before main method because it is excute at the time of object creation
//        System.out.println("Company Name :"+company); // it gives you to error becuase of the company is local variable in main method and we are trying to access it outside of the main method and we now local variable's can't be access outside of the block

        System.out.println("Non static Position :"+position);  // Here we can direct access posistion without any object creation because non static members are accessable in non static context without object creation
        System.out.println("Non static Role :"+role); //Here static member we can access static member directly in the non static context
    }
}
