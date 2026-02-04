import java.util.*;

public class matrix {
    public static int dignoalsum(int arr1[][]) {
        int sum = 0;
        // for (int i = 0; i < arr1.length; i++) {
        // for (int j = 0; j < arr1[0].length; j++) {
        // if (i == j) {
        // sum += arr1[i][j];
        // } else if (i + j == arr1.length - 1) {
        // sum += arr1[i][j];
        // }
        // }
        // }

        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i][i];
            if (i != arr1.length - 1 - i) {
                sum += arr1[i][arr1.length - 1 - i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your colum of matrix : ");
        int n = sc.nextInt();
        System.out.println("ENter your row of matrix ");
        int m = sc.nextInt();
        int arr1[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr1[i][j] = sc.nextInt();
            }

        }
        int value = dignoalsum(arr1);
        System.out.println("the digonal sum of your matrix is : " + value);

        sc.close();

    }
}
