package p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(13);
        numbers.add(4);
        numbers.add(8);
        numbers.add(2);
        System.out.println(numbers);

        Collections.sort(numbers,Collections.reverseOrder());
        System.out.println(numbers);
    }
}
