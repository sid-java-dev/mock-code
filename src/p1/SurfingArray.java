package p1;

public class SurfingArray {

    public static void main(String[] args) {
        int[]array={15,22,41,5,4,78};

        //for-loop
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        //for-Each
        for(int n:array){
            System.out.println(n);
        }
        //while loop
        int j=0;
        while(j<array.length){
            System.out.println(array[j]);
            j++;
        }
        //do-while
        int k=0;
        do{
            System.out.println(array[k]);
            k++;
        }while(k<array.length);


    }
}
