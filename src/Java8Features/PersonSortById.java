package Java8Features;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PersonSortById {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Person> list=new ArrayList<>();


        list.add(new Person(103,"Kishor",23));
        list.add(new Person(105,"Ajay",22));
        list.add(new Person(107,"Sanjay",24));
        list.add(new Person(102,"Shitij",25));
        list.add(new Person(100,"Piyush",23));
        list.add(new Person(106,"Rishabh",24));
        list.add(new Person(108,"Pankaj",25));
        list.add(new Person(109,"Rishi",23));
        list.add(new Person(101,"Gourav",25));
        list.add(new Person(104,"Sourabh",24));


        System.out.println("Before Sorting :");
        for(Person l:list){
            System.out.println(l);
        }
        System.out.println("******************************************************");
        Collections.sort(list);

        System.out.println("After Sorting :");
        for(Person l2:list){
            System.out.println(l2);
        }

    }
}
