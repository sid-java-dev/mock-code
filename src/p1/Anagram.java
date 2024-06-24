package p1;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1="abcd";
        String s2="abcde";
        char[] s1CharArray = s1.toCharArray();
        char[] s2CharArray = s2.toCharArray();

        Arrays.sort(s1CharArray);
        Arrays.sort(s2CharArray);

        if(Arrays.equals(s1CharArray,s2CharArray)){
            System.out.println("anagram");
        }else{
            System.out.println("not an anagram");
        }
    }
}
