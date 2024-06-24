package p1;

public class Series {
    public static void main(String[] args) {
        //8 6 9

        int number=8;
        int nextNumber=0;
        System.out.print(number+" ");
        for(int i=1;i<10;i++){
            nextNumber=number*i-(i+1);
            System.out.print(nextNumber+" ");
            number=nextNumber;
        }

    }
}
