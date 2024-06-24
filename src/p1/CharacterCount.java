package p1;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args) {
        String str="java";
        char[] charArray = str.toCharArray();
//j=1 a=2 v=1
        Map<Character,Integer> map=new HashMap<>();
        for(Character c:charArray){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }

        }
        System.out.println(map);
    }
}
