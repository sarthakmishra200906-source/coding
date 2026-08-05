import java.util.*;
public class TileWays {
    public static int tilingProblem(int n){//2*N(FLOOR SIZE)
        if(n==0 || n==1){
            return 1;
        }
        //vertical choice
        int fnm1 =tilingProblem(n-1);
        //horizontal choice
        int fnm2 = tilingProblem(n-2);
        return fnm1+fnm2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the floor length:");
        int n = sc.nextInt();
        int ways = tilingProblem(n);
        System.out.println("Number of ways to tile the floor: " + ways);
    }
}
