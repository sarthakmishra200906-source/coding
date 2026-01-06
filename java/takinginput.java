import java.util.Scanner;
public class takinginput{
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        System.out.println("Enter your number ");
        int num_1 = sc.nextInt();
        System.out.println("lucky number is : "+num_1);
        sc.close();
    }
}
