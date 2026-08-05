import java.util.*;
public class OptimisedPower {
    public static int power(int a, int b) {
        if(b==0){
            return 1;
        }
        if(b%2==0){
            return power(a*a, b/2);
        }
        else{
            return a*power(a*a,b/2);

        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int a = sc.nextInt();
        System.out.println("Enter power of number: ");
        int b = sc.nextInt();
        
        int value = power(a, b);
        System.out.println("Your power value is " + value);
    }
}

