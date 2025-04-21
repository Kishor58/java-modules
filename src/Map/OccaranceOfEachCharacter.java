package Map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OccaranceOfEachCharacter {
    public static void occarance(String str){
        Map<Character,Integer> occ=new HashMap<>();
        for(Character c:str.toCharArray()){
            occ.put(c,occ.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> entry:occ.entrySet()){
            System.out.print(entry.getKey()+" :"+entry.getValue()+" ,");
        }
    }
    public static void main(String[] args) {
        String str="Programming";
        occarance(str);
    }
}

