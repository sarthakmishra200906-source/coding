import java.util.*;
public class SumNaturalNumber {
    public static int naturalNumber(int a){
        if (a==1){
           
            return a;
        }
        int result = a + naturalNumber(a-1);
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number to take out their sum : ");
        int a = sc.nextInt();
        int result = naturalNumber(a);
        System.out.println("your sum of natural no till "+ a +" is "+ result);

    }
}
