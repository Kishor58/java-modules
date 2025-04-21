package Java8Features;

import java.util.ArrayList;

public class StudentSorting {
    public static void main(String[] args) {
        ArrayList<Student> student=new ArrayList<>();

        student.add(new Student(1008,"Ganesh","ganesh12@gmail.com","IIST", 7685949320L));
        student.add(new Student(1007,"Kshitij","kshitij21@gmail.com","IIST", 7685949320L));
        student.add(new Student(1006,"Piyush","piyush43@gmail.com","IIST", 7685949320L));
        student.add(new Student(1005,"Sanjay","Sanjay65@gmail.com","IIST", 7685949320L));
        student.add(new Student(1004,"Ajay","ajay76@gmail.com","IIST", 7685949320L));
        student.add(new Student(1003,"Vamshi","vamshi89@gmail.com","IIST", 7685949320L));
        student.add(new Student(1002,"Pawan","pawan89@gmail.com","IIST", 7685949320L));
        student.add(new Student(1001,"Durga","durga32@gmail.com","IIST", 7685949320L));
        student.add(new Student(1003,"Bharat","bharat43@gmail.com","IIST", 7685949320L));
        student.add(new Student(1004,"Krishna","krishna12@gmail.com","IIST", 7685949320L));
        student.add(new Student(1005,"Dikshya","dikshya21@gmail.com","IIST", 7685949320L));

       for(Student stu:student){
           System.out.println(stu);
       }

    }
}
