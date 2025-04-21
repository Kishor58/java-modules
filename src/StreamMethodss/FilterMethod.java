package StreamMethodss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMethod {
    public static void main(String[] args) {
        List<Integer> l1= Arrays.asList(3,5,6,8,3,1,6,4,0);

        List<Integer> even=l1.stream().filter(i->i%2==0).sorted().collect(Collectors.toList());

        System.out.println(even);

    }
}
