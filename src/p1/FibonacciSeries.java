package p1;

public class FibonacciSeries {
    //0 1 1 2 3 5 8 13
    public static void main(String[] args) {
        int NumLimit=10;
        int a=0;
        int b=1;
        System.out.print(a+" "+b+" ");
        for(int i=0;i<NumLimit-2;i++){
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;

        }
    }
}
