package bitmanupulation;

import java.util.*;

public class oddeven {
    public static void oddOrEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            // even number
            System.out.println("even number");

        } else {
            System.out.println("odd number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        oddOrEven(n);
        sc.close();
    }

}
