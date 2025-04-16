package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionMethods {
    public static void main(String[] args) {
        System.out.println("Collection Methods");

        Collection<String> collection=new ArrayList<>();

        //1.add methods
        collection.add("Apple");
        collection.add("Orange");
        collection.add("Berry");
        collection.add("Graphs");

        System.out.println(collection);

        //2.addAll(Collection<?)
        List<String> list2=new ArrayList<>();
        list2.add("Mango");
        list2.add("Banana");
        collection.addAll(list2);

        System.out.println("After Adding new list :");

        System.out.println(collection);

        //3.clear()
//        collection.clear();
//        System.out.println("Data cleared :"+collection);

//        4.contains(object o)
        System.out.println(collection.contains("Merry"));




//        Collection<Integer> c2=new ArrayList<>();
//        collection.addAll(c2);
    }
}
