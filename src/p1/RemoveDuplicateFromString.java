package p1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFromString {
    public static void main(String[] args) {
        String str="java";
        char[] chars = str.toCharArray();
        StringBuilder uniqueCharacter=new StringBuilder();
        Set<Character> set=new LinkedHashSet<>();
        for(Character ch:chars){
           if( set.add(ch)){
               uniqueCharacter.append(ch);
           }
        }
        System.out.println(uniqueCharacter);

    }
}
