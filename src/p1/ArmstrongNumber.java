package p1;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int count=0;
        for(int number=1;number<=100;number++){
            if(isArmstrong(number)){
                System.out.println(number);
                count++;
            }
        }
        System.out.println("total armstrong number between 1 to 100 is: "+count);

    }
    public static boolean isArmstrong(int number){
        int originalNUmber=number;
        int numDigits=String.valueOf(number).length();
        int sum=0;
        while (number>0){
            int digit=number%10;
            sum+=Math.pow(digit,numDigits);
            number/=10;
        }
        return sum==originalNUmber;
    }
}
