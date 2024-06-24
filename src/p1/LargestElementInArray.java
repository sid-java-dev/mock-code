package p1;

import java.util.Arrays;

public class LargestElementInArray {
    public static void main(String[] args) {
        int []a1={14,5,6,87,96,41,96};

        int max=a1[0];
        for (int  i= 0;  i<a1.length ; i++) {
            if(a1[i]>max){
                max=a1[i];
            }
        }
        System.out.println(max);

    }
}
