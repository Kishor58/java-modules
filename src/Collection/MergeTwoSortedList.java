package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class MergeTwoSortedList {
    public static void main(String[] args) {
        ArrayList<Integer> name=new ArrayList<>();
        name.add(109);
        name.add(108);
        name.add(106);
        name.add(107);
        name.add(110);
        ArrayList<Integer> id=new ArrayList<>();
        id.add(104);
        id.add(103);
        id.add(102);
        id.add(101);
        id.add(105);
        name.addAll(id);
        Collections.sort(name);
        System.out.println(name);



    }
}
