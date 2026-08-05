import java.util.*;

public class subarraysum {
    public static void subsum(int arr1[]) {

        int result1 = Integer.MIN_VALUE;
        int result2 = Integer.MAX_VALUE;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = i; j < arr1.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {

                    System.out.print(arr1[k] + " ");
                    sum = sum + arr1[k];

                }
                System.out.println("the sum is " + sum);
                if (result1 < sum) {
                    result1 = sum;
                }
                if (result2 > sum) {
                    result2 = sum;
                }

            }
            System.out.println();
        }
        System.out.println("the largest sub array sum  is : " + result1);
        System.out.println("the smallest sub array sum is : " + result2);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element value of array : ");
            arr1[i] = sc.nextInt();

        }
        subsum(arr1);

        sc.close();
    }
}
