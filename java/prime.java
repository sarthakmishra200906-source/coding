import java.util.*;

public class prime {
    public static boolean Prime(int a) {

        if (a == 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int a = sc.nextInt();
        Prime(a);
        System.out.println(Prime(a));
        sc.close();

    }
}
