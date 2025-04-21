package Map;

import java.util.*;

public class OccaranceOfString {
    public static String occaranceString(List<String> list){
        Map<String ,Integer> map=new HashMap<>();
        for(String o:list){
            map.put(o,map.getOrDefault(o,0)+1);
        }
        StringBuilder result=new StringBuilder();

        for(Map.Entry<String,Integer> entry:map.entrySet()){
            result.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        return result.toString();
    }
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Apple","Banana","Berry","Mango","Apple","Mango");

//        System.out.println(list);
        System.out.println(occaranceString(list));
    }
}
