import java.util.*;

public class inbuiltshort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of your array : ");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter your element : ");
            arr1[i] = sc.nextInt();

        }
        Arrays.sort(arr1);
        System.out.println("your shorted array is : ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        sc.close();
    }
}
