import java.util.*;

public class selectionshort {
    public static void shorting(int arr1[]) {
        for (int i = 0; i < arr1.length - 1; i++) {
            int minpos = i;
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[minpos] > arr1[j]) {
                    minpos = j;
                }

            }
            int temp = arr1[minpos];
            arr1[minpos] = arr1[i];
            arr1[i] = temp;
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
