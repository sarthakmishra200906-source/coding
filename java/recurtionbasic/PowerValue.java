import java.util.*;

public class PowerValue {
    // Elegant recursive method to find a^b
    public static int power(int a, int b) {
        // Base case: any number to the power of 0 is 1
        if (b == 0) {
            return 1;
        }
        // Recursive case: a^b = a * a^(b-1)
        return a * power(a, b - 1);
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