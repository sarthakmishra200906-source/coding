import java.util.Scanner;

public class arithmaticoperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter your first number ");
        int a = sc.nextInt();
        System.out.println("Enter your second number");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("add : " + c);
        c = a - b;
        System.out.println("sub : " + c);
        c = a / b;
        System.out.println("div : " + c);
        c = a % b;
        System.out.println("rem : " + c);

        sc.close();
    }
}
