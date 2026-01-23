import java.util.*;

public class recfact {
    public static int fact(int a) {
        if (a == 1) {
            return 1;
        }

        return a * fact(a - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number whose factorial you want to calculate : ");
        int a = sc.nextInt();
        fact(a);
        int c = a * fact(a - 1);
        System.out.println("your factorial is " + c);
        sc.close();

    }
}
