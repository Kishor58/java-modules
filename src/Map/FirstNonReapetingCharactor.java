package Map;

import java.util.HashMap;
import java.util.Map;

public class FirstNonReapetingCharactor {
    public static void main(String[] args) {
        String str="programming";

        Map<Character,Integer> freq=new HashMap<>();

        for(Character ch:str.toCharArray()){
            freq.put(ch, freq.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry: freq.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
