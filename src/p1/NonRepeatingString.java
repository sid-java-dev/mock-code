package p1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NonRepeatingString {
    public static void main(String[] args) {
        String str="aabcd";
        char[] ch = str.toCharArray();
        Map<Character,Integer> map=new HashMap<>();

        for(Character c:ch){
            if(map.containsKey(c)){
               map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        for(Map.Entry<Character,Integer> e:map.entrySet()){
            if(e.getValue()==1){
                System.out.println(e.getKey());
            }
        }
    }

}
