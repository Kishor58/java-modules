package StreamMethodss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedMethod {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(4);
        list.add(9);
        list.add(3);
        list.add(2);
        list.add(7);

        List<Integer> list2=list.stream().sorted().collect(Collectors.toList());

        System.out.println(list2);

        List<String>  str=new ArrayList<>();
        str.add("Anushka Sharma");
        str.add("Pallavi Jadhaw");
        str.add("Varsha Pawar");
        str.add("Vaishnavi Rathod");
        str.add("Nikita Patil");

//        List<String> str2=str.stream().sorted().collect(Collectors.toList());

//        System.out.println(str2);

        //Using comprator  and comprable

//        Using comprator sorting by based on length of the string
        Comparator<String> c=(s1,s2)->{
                int l1=s1.length();
                int l2=s2.length();
                if(l1<l2) return -1;
                else if(l1>l2) return 1;
                else return s1.compareTo(s2);
        };
        List<String> str3=str.stream().sorted(c).collect(Collectors.toList());

        System.out.println(str3);

//

    }
}
