package StudentManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class StudentManagement {
    private static List<Student> studentlist=new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        defaultAddStudent(sc);
        boolean flag=true;
        while(flag){
            System.out.println("Student Management System :");
            System.out.println("1. Search the student details ");
            System.out.println("2. View list of Student On <Pagination>");
            System.out.println("3. View Details Of Student by Id");
            System.out.println("4. Add New Student");
            System.out.println("5. View all the students Details");
            System.out.println("6. Exit");
            System.out.println("Enter Your Choice :");
            int choice=sc.nextInt();
            switch(choice){
                case 1->{
                    System.out.println("Student is searching....");
                }
                case 2->{
                    System.out.println("It is list of student");
                }
                case 3->{
                    System.out.println("It's particular student detail");
                }
                case 4->{
                    System.out.println("Added New Student ");
                }
                case 5->{
                    System.out.println("ALl the student details : ");
                    showALlTheDetailsOfStudent();
                }
                case 6->{
                    flag=false;
                    System.out.println("Program is terminate ");
                }
                default -> {
                    System.out.println("Invalid Choice :1");
                }
            }
        }
    }
    private static void defaultAddStudent(Scanner sc){
        System.out.println("How many Student You want to add for Test program ;");
        int count=sc.nextInt();
        Random random = new Random();

        for(int i=1;i<count;i++){
            float cgpa = random.nextFloat() * 10;
            cgpa = (float) (Math.round(cgpa * 100.0) / 100.0);

            studentlist.add(new Student(i ,"Student"+i,"stu"+i+"@wcs.com",i<10 || i>30?"B.tech":"M.tech",cgpa));
        }
        System.out.println(count +" Student Added Successfully");
    }
    private static void showALlTheDetailsOfStudent(){
        for(Student student:studentlist){
            System.out.println(student);
        }
    }
}
