import java.util.*;

public class revarr {
    public static void rev(int arr1[]) {
        for (int i = arr1.length - 1; i >= 0; i--) {
            System.out.print(arr1[i] + " ");
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter your element : ");
            arr1[i] = sc.nextInt();

        }
        System.out.println("actual array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println("Reversed array:");
        rev(arr1);
        sc.close();
    }
}
