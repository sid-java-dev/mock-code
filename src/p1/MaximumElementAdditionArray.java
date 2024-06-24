package p1;

import java.util.Arrays;

public class MaximumElementAdditionArray {

    public static void main(String[] args) {
        int arr[] = {10, 2, 3, -5, 99, 12, 0, -1};
        int firstMax=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>firstMax){
                secondMax=firstMax;
                firstMax=arr[i];
            }else{
               if(arr[i]>secondMax){
                   secondMax=arr[i];
               }
            }
        }
        int sum=firstMax+secondMax;
        System.out.println(sum);

    }
}

