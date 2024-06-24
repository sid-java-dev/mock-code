package p1;

import java.util.HashMap;
import java.util.Map;

public class CopyHashMap {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"mike");
        map.put(2,"dev");
        map.put(3,"smith");
        Map<Integer,String> map2=new HashMap<>(map);
        map2.putAll(map);
        System.out.println(map2);
    }
}
