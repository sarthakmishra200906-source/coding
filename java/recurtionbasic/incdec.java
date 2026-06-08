import java.util.*; // Fixed the typo here ('java' instead of 'jawa')

public class incdec { // Everything must live inside this main class

    // 1. This is your increasing function (Corrected to be a method)
    public static void inc(int n) {
        if (n == 0) {
            return;
        }
        inc(n - 1);
        System.out.println(n);  
    }

    // 2. This is your decreasing function (Corrected to be a method)
    public static void dec(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        dec(n - 1);
    }

    // 3. This is the main method where the program actually starts running
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println("--- Increasing ---");
        inc(n);
        
        System.out.println("--- Decreasing ---");
        dec(n);
        
        sc.close(); // Good practice to close the scanner
    }
}