import java.util.*;

public class pairarr {
    public static int ispared(int arr1[]) {
        for (int i = 0; i < arr1.length; i++) {
            int curr = arr1[i];
            for (int j = i + 1; j < arr1.length; j++) {
                System.out.print("(" + curr + "," + arr1[j] + ")");

            }
            System.out.println();
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your length of array : ");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value of element : ");
            arr1[i] = sc.nextInt();
        }
        ispared(arr1);
        sc.close();
    }
}
