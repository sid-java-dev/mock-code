package p1.collectionExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class EmployeeDemo {
    public static void main(String[] args) {

        //If we have employee data then sort it by id using hashmap
        HashMap<Integer,Employee>map=new HashMap<>();
        map.put(5, new Employee(3,"mike",2500.00));
        map.put(3, new Employee(2,"dev",3000.00));
        map.put(2, new Employee(1,"mike",1500.00));
        map.put(1, new Employee(5,"mike",2000.00));
        System.out.println(map);

        List<Integer>sortedList=new ArrayList<>(map.keySet());
        System.out.println(sortedList);


    }
}
