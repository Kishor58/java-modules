package StreamMethodss;

import java.util.ArrayList;
import java.util.Arrays;

public class ToArrayMethod {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>();
        l.add(10);
        l.add(21);
        l.add(2);
        l.add(5);
        l.add(20);

        Integer[] i=l.stream().toArray(Integer[]::new);

        System.out.println(Arrays.toString(i));
    }
}
