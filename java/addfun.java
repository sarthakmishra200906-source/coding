import java.util.*;
public class addfun {
    public static int add(int a ,int b){
        int c= a+b;
        return c;
    }
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your first number : ");
        int a=sc.nextInt();
         System.out.println("Enter your second number : ");
        int b = sc.nextInt();
       
       int c= add(a,b);
       System.out.println("your sum of number is :"+ c);

        
        sc.close();

    }
}
