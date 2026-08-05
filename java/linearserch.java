import java.util.*;

public class linearserch {
    public static int search(int num[], int key) {
        for (int i = 0; i <= num.length; i++) {
            if (num[i] == key) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();

        int key = 10;
        int num[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter your  element no  "+ i);
            num[i] = sc.nextInt();

        }
        search(num, key);
        int result = search(num, key);
        if (result == -1) {
            System.out.println("element not found ");
        } else {
            System.out.println("element found at index : " + result);
        }
        sc.close();

    }
}
