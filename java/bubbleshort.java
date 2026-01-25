import java.util.*;

public class bubbleshort {
    public static void increasing(int arr1[]) {
        for (int turn = 0; turn < arr1.length - 1; turn++) {
            for (int j = 0; j < arr1.length - 1 - turn; j++) {
                if (arr1[j] > arr1[j + 1]) {
                    int temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;
                }
            }
        }
        System.out.println("your increasing sorting is : ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

    }
    public static void decreasing(int arr1[]) {
        for (int turn = 0; turn < arr1.length - 1; turn++) {
            for (int j = 0; j < arr1.length - 1 - turn; j++) {
                if (arr1[j] < arr1[j + 1]) {
                    int temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;
                }
            }
        }
        System.out.println("your decreasing sorting is : ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the element : ");
            arr1[i] = sc.nextInt();
        }
        increasing(arr1);
        decreasing(arr1);
        sc.close();
    }

}