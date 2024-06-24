package p1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateFromArrayList {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(41);
        list.add(4);
        list.add(2);
        list.add(25);
        list.add(41);
        Set<Integer> set=new HashSet<>(list);
        List<Integer> list2=new ArrayList<>(set);

        System.out.println(list2);
    }
}
