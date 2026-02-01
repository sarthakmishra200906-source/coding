import java.util.*;

public class stok {
    public static int buysellstoks(int prices[]) {
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;

        // now run loop till 0 to nmean prices.length
        for (int i = 0; i < prices.length; i++) {
            if (buyprice < prices[i]) {
                int profit = prices[i] - buyprice;
                maxprofit = Math.max(maxprofit, profit);
            } else {
                buyprice = prices[i];
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of day : ");
        int n = sc.nextInt();
        int prices[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the stok price  : ");
            prices[i] = sc.nextInt();
        }
        int result = buysellstoks(prices);

        System.out.println("your max profit is " + result);
    }
}
