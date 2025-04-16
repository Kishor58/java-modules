package Collection;

import java.util.*;

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
//        5.containAll(Collection<>?)
         List<String> list3=new ArrayList<>();
         list3.add("Apple");
         list3.add("Orange");
         list3.add("Berry");
         list3.add("Graphs");

        System.out.println(collection.containsAll(list3)); //true
        System.out.println(list2.containsAll(collection)); //fasle

//      6.equals(Object o)
        List<String> list4=new ArrayList<>(collection);
        System.out.println(collection.equals(list4)); //true

//      7.isEmpty()
        System.out.println(collection.isEmpty());//false

//      8.iterator
        Iterator<String> iterator=collection.iterator();
        System.out.println("Iterate objects using iterator :");
        while(iterator.hasNext()){
            System.out.println(iterator.next()+" ");
        }

//      9.remove(Object o)
        collection.remove("Berry");
        System.out.println("After remove single object :"+collection); //[Apple, Orange, Graphs, Mango, Banana]

//      10.removeAll(Collection<>?)
//        collection.removeAll(list2);
//        System.out.println(collection); // [Apple, Orange, Graphs] it's remove matched object from collection

//      11.retainAll(Collection <>?)
//        collection.retainAll(list2);
//        System.out.println("After retainAll :"+collection); //[Mango, Banana]

//      12.size()
        System.out.println("Size of the collection :"+collection.size());//5

//        13.toArray()
        Object[] arr=collection.toArray();
        System.out.println("Iteration using toArray Method :"+Arrays.toString(arr));





//        Collection<Integer> c2=new ArrayList<>();
//        collection.addAll(c2);
    }
}
