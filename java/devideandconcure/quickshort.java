import java.util.*;

public class quickshort {

    public static void printArray(int arr1[]) {
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
    }

    public static void quickshort(int arr1[], int si, int ei) {
        // Base case: if array section is single element or empty
        if (si >= ei) {
            return;
        }

        // Partition step
        int pIdx = partition(arr1, si, ei);
        quickshort(arr1, si, pIdx - 1); // Left partition
        quickshort(arr1, pIdx + 1, ei); // Right partition
    }

    public static int partition(int arr1[], int si, int ei) {
        int pivot = arr1[ei];
        int i = si - 1; // Makes space for elements smaller than pivot

        for (int j = si; j < ei; j++) {
            if (arr1[j] <= pivot) {
                i++;
                // Swap arr1[i] and arr1[j]
                int temp = arr1[j];
                arr1[j] = arr1[i];
                arr1[i] = temp;
            }
        }

        // Swap pivot into correct position
        i++;
        int temp = pivot;
        arr1[ei] = arr1[i];
        arr1[i] = temp;

        return i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();
        int arr1[] = new int[n];

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            arr1[i] = sc.nextInt();
        }

        // Perform Quick Sort
        quickshort(arr1, 0, arr1.length - 1);

        // Print sorted array
        System.out.print("Sorted Array: ");
        printArray(arr1);

        sc.close();
    }
}
