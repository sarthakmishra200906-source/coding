import java.util.*;

public class rectraingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your length of hollow rectraingle : ");
        int a = sc.nextInt();
        System.out.println("Enter your breth of hollow rectraingle : ");
        int b = sc.nextInt();
        for (int i = 1; i <= b; i++) {
            for (int j = 1; j <= a; j++) {
                if (j == 1 || j == a || i == 1 || i == b) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        sc.close();

    }
}
