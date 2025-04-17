package StreamMethodss;

import java.util.ArrayList;
import java.util.List; // <-- This import was missing
import java.util.stream.Collectors;

public class SteamMethods {
    public static void main(String[] args) {

//      Filter Method In Stream
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        l1.add(3);
        l1.add(5);
        l1.add(6);
        l1.add(9);
        l1.add(1);
        l1.add(8);

        System.out.println("Collection Objects:");
        System.out.println(l1);

        // Traditional way (commented out)
        /*
        Iterator<Integer> iterator = l1.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num % 2 == 0) {
                System.out.println("Even Number: " + num);
            }
        }
        */

        // Stream way
        List<Integer> l2 = l1.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Filtered Even Numbers using Stream:");
        System.out.println(l2);

//      map() method
        // let's suppose we have hike 1000 for each employee salary

        ArrayList<Double> sal=new ArrayList<Double>();
        sal.add(15000.0);
        sal.add(13000.0);
        sal.add(12000.0);
        sal.add(17000.0);
        sal.add(19000.0);
        sal.add(12000.0);

        System.out.println("Current Salary Of Employee :");
        System.out.println(sal);
        List<Double> updateSal=sal.stream().map(i->i+1000.0).collect(Collectors.toList());

        System.out.println("Updated Salary's Of Employee :");
        System.out.println(updateSal);

    }
}
