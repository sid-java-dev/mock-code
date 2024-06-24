package p1;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] num = {1, 4, 32, 1, 5};
        int temp;
        for (int j = 0; j < num.length - 1; j++) {
            for (int i = 0; i < num.length - 1; i++) {
                if (num[i] > num[i + 1]) {
                    temp = num[i];
                    num[i] = num[i + 1];
                    num[i + 1] = temp;
                }
            }
        }
        for (Integer n : num) {
            System.out.print(n + " ");
        }


    }
}
