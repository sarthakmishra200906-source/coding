import java.util.*;

public class avrage3num {
    public static void avg(int a, int b, int c) {
        int avrage = (a + b + c) / 3;
        System.out.println("your avrage of 3 number is : " + avrage);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number : ");
        int a = sc.nextInt();
        System.out.println("Enter your second number : ");
        int b = sc.nextInt();
        System.out.println("Enter your third number : ");
        int c = sc.nextInt();
        avg(a, b, c);
        sc.close();

    }
}
