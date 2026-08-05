import java.util.*;

public class largnoarr {
    public static int larger(int arr1[]) {
        int greatest = Integer.MIN_VALUE;
        for (int i = 0; i < arr1.length; i++) {
            if (greatest <= arr1[i]) {
                greatest = arr1[i];
            }

        }
        return greatest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter your element no : " + i);
            arr1[i] = sc.nextInt();

        }
        larger(arr1);
        int result = larger(arr1);
        System.out.println(" the largest no in array is " + result);

        sc.close();
    }
}
