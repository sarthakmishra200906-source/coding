import java.util.Scanner;
public class rectangleparten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter breth of rectangle :");
        int b = sc.nextInt();
        System.out.println("Enter your length of rectangle : ");
        int l = sc.nextInt();
        for(int i = 1; i<=b;i++){
            for(int j=1;j<=l;j++){
               System.out.print("*");
            }
            System.out.println();
        }
        sc.close();

    }
}
