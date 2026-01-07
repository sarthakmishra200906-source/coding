import java.util.Scanner;
public class simpleintrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your princpal amount:");
        float p = sc.nextFloat();
        System.out.println("Enter your rate of intrest:");
        float r =sc.nextFloat();
        System.out.println("Enter your time period:");
        float t =sc.nextFloat();
        float si =(p*r*t)/100;
        System.out.println(" your simple intrest is :" + si);
        sc.close();
    }
}
