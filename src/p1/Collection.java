package p1;

import java.util.*;

public class Collection {
    public static void main(String[] args) {
        HashSet<String>hashSet=new HashSet<>();
        hashSet.add("mike");
        hashSet.add("stallin");
        hashSet.add("sam");
        hashSet.add(null);
        System.out.println("Hashset"+hashSet);

        Set<String>linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add("mike");
        linkedHashSet.add("stallin");
        linkedHashSet.add("sam");
        linkedHashSet.add(null);
        System.out.println("LinkedHashSet"+linkedHashSet);

        Set<String> treeSet=new TreeSet<>();
        treeSet.add("mike");
        treeSet.add("Stallin");
        treeSet.add("sam");
        treeSet.add(null);
        System.out.println("treeSet"+treeSet);

    }
}
