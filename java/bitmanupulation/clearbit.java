package bitmanupulation;
import java.util.*;
public class clearbit {
    public static int clearIthBit(int n,int i){
        int bitMask = ~(1<<i);
        return n&bitMask;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        System.out.println(clearIthBit(n,i));
        sc.close();
    }
}
