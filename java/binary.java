import java.util.*;

public class binary {
    public static int search(int[] arr1, int key) {
        int start = 0, stop = arr1.length - 1;
        while (start <= stop) {
            int mid = (start + stop) / 2;
            if (arr1[mid] == key) {
                return mid;
            }
            if (arr1[mid] < key) {
                start = mid + 1;
            } else {
                stop = mid - 1;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter you element : ");
            arr1[i] = sc.nextInt();
        }
        int key = 10;
        search(arr1, key);
        System.out.println("your index for key is " + search(arr1, key));
        sc.close();

    }
}
