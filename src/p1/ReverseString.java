package p1;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hi Siddhant";
        String[]s=str.split(" ");
        String result="";
for(int i=s.length-1;i>=0;i--){
    result+=s[i]+" ";
}
        System.out.println(result);

    }
}
