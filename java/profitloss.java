import java.util.Scanner;
public class profitloss{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Cost Price : ");
        double cp = sc.nextDouble();
        System.out.println("Enter Selling Price : ");
        double sp = sc.nextDouble();
        if(sp > cp){
            double profit = sp - cp;
            System.out.println("You made a profit of : " + profit);
        }
        else if(cp > sp){
            double loss = cp - sp;
            System.out.println("You incurred a loss of : " + loss);
        }
        else{
            System.out.println("No profit no loss.");
        }
        sc.close();
    }
}
