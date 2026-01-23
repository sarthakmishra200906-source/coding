import java.util.*;

public class factorial {
    public static int fact(int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {

            result = result * i;

        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your factorial of number : ");
        int a = sc.nextInt();
        fact(a);
        int result = fact(a);
        System.out.println("your factorial of no is : " + result);
        sc.close();
    }
}
