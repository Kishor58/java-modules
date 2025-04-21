package StreamMethodss;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapMethod {
    //map() method are used to change the object in whole list object means when we want to same changes in all the object at time that time we can use map mathod
   //In this program we are used collect() method ,stream() method ,count() method and map() method .


    public static void main(String[] args) {
        List<String> list= Arrays.asList("Madhuri","Krishna","Vijay","Meghana","Manisha");

        List<String> uppercase=list.stream().filter(i->i.startsWith("M")).map(i->i.toUpperCase()).sorted().collect(Collectors.toList());
        long count=uppercase.stream().count();

        System.out.println("Total People who's name start with 'M' :"+count);
        System.out.println(uppercase );


    }


}
