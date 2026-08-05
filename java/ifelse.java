
import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println("it is even number : ");
        }else{
            System.out.println("it is a odd number : ");
        }
        sc.close();
    }
}
