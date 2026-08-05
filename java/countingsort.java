import java.util.*;

public class countingsort {
    public static void shorting(int arr1[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr1.length; i++) {
            largest = Math.max(largest, arr1[i]);
        }
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr1.length; i++) {
            count[arr1[i]]++;
        }
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr1[j] = i;
                j++;
                count[i]--;
            }
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
