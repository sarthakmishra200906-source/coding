import java.util.*;

public class insersion {
    public static void shorting(int arr1[]) {
        for (int i = 1; i < arr1.length; i++) {
            int curr = arr1[i];
            int prev = i - 1;
            while (prev >= 0 && arr1[prev] > curr) {
                arr1[prev + 1] = arr1[prev];
                prev--;
            }
            arr1[prev + 1] = curr;
        }
        System.out.println("your shorted array is : ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of your array : ");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter your element : ");
            arr1[i] = sc.nextInt();

        }
        shorting(arr1);
        sc.close();
    }
}