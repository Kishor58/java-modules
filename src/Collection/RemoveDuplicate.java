package Collection;

import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        list.add(20);
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(30);
        list.add(60);
        list.add(40);
        list.add(50);
        list.add(40);

        System.out.println("Before Removing Duplicate Object :");
        System.out.println(list);
        Set<Integer> set=new HashSet<>(list);
        System.out.println("After Removing the duplicate :");
        ArrayList<Integer> list2=new ArrayList<>(set);

        Collections.sort(list2);

        for(Integer l2:list2){
            System.out.println(l2);
        }





    }
}
