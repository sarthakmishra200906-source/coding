import java.util.*;
public class Fibonaccay{
    public static int fibonaccay(int a ){
     if(a==0||a==1){
        return a;
     }
     
     int value=fibonaccay(a-1)+fibonaccay(a-2);
     return value;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your number to calculate fibonaccay series of number : ");
        int a = sc.nextInt();
        int result =fibonaccay(a);
        System.out.println("your fibonaccay sum of "+ a + " is "+ result);
    }
}