package p1;

import java.util.HashSet;
import java.util.Set;

public class duplicateElementInArray {
    public static void main(String[] args) {
        int[]array={12,4,5,4,5,7};
        Set<Integer> set=new HashSet<>();
        for(Integer n:array){
            if(!set.add(n)){
                System.out.println("duplicate element are: "+n);
            }
        }
    }
}
