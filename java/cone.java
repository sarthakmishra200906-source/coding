import java.util.Scanner;

public class cone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int n = sc.nextInt();
        
        
        for (int i = 1; i <= n; i++) {
             for (int k = i; k<=1; k++) {
                System.out.print(" ");

            }
           
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
             for (int k = 2; k<=2*i-1; k++) {
                System.out.print(" ");

            }
           
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
