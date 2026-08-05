import java.util.*;

public class subarr {
    public static void element(int arr1[]) {
        int ts = 0;
        for (int i = 0; i < arr1.length; i++) {
            int start = i;
            for (int j = i; j < arr1.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr1[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("your total subarray is " + ts);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your length of array : ");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter your element : ");
            arr1[i] = sc.nextInt();
        }
        element(arr1);
        sc.close();
    }
}
