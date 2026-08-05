import java.util.*;

public class traprain {
    public static int trapedrainwater(int height[], int m) {
        int n = height.length;
        int width = m;
        // Calculate the keft max boundry -array
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }
        // calculate the right max boundry - array
        int rightmax[] = new int[n];
        rightmax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }

        // creat a variable and keep on adding the value obtained and print at last to
        // get total area of water stored
        // (min(leftmax ,right max )-height )*width=traped rain water
        int trapedwater = 0;
        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            trapedwater += (waterlevel - height[i]) * width;
        }

        return trapedwater;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of bulding : ");
        int n = sc.nextInt();
        int height[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the height : ");
            height[i] = sc.nextInt();
        }
        System.out.print("enter the wifth of bulding : ");
        int m = sc.nextInt();
        int result = trapedrainwater(height, m);
        System.out.print("Your total traped water is :" + result);

    }
}
