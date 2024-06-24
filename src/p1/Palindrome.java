package p1;

public class Palindrome {
    public static void main(String[] args) {
        int input=120;
        if(palindromeNumber(input)){
            System.out.println("given number is palindrome number");
        }else{
            System.out.println("given number is not a palindrome");
        }
    }

    public static boolean palindromeNumber(int number){
        int originalNum=number;
        int reverserNum=0;
        while (originalNum>0){
            int modulo=originalNum%10;
            reverserNum=reverserNum*10+modulo;
            originalNum=originalNum/10;
        }
        return reverserNum==number;
    }

}
