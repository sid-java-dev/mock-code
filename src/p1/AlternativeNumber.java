package p1;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AlternativeNumber {
    public static void main(String[] args) {
//       String str="q621889613 ";
//      String regex="[6-9][0-9]{9}";
//        if(str.matches(regex)){
//            System.out.println("valid");
//        }else{
//            System.out.println("not valid");
//        }


        int[]array={1,5,4,8,-7,1,-5};
        int[]result=new int[array.length];
        int j=0;
        for(Integer n:array){
            result[j]=n*n;
            j++;
        }
        Arrays.sort(result);
        for(Integer r:result){
            System.out.println(r);
        }
    }
}
