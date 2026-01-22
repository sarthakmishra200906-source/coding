import java.util.*;
public class profun {
    public static int sum(int a,int b){
     int sum =a*b;
     return sum;
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your first number :");
      
      int a= sc.nextInt();
       System.out.println("Enter your first number :");
      int b= sc.nextInt();
      sum(a,b);
      int sum=sum(a,b);
      System.out.println("your product of 2 no is :"+ sum);
      sc.close();


    }
}
