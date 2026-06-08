import java.util.*;
public class factorial {
    public static int factorial(int a ){
        if(a==0){
            a=1;
            return a;
        }
        int value = a*factorial(a-1);
        return value;
    }
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int a = sc.nextInt();
        int result =factorial(a);
        System.out.println("your factorial of "+  a +  "is" + result);
    }
}
