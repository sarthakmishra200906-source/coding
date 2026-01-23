import java.util.*;

public class evenodd {
    public static Boolean isEven(int a) {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to know weather even  : ");
        int a = sc.nextInt();
        isEven(a);
        sc.close();
        System.out.println(isEven(a));

    }
}
