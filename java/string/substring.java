import java.util.*;
public class substring {
    public static String substring1(String str,int si ,int ei){
        String substr ="";
        for(int i =0;i<ei;i++){
            substr +=str.charAt(i);

        }
        return substr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= "helloworld ";
        System.out.println("enter  starting index  : ");
        int si= sc.nextInt();
         System.out.println("enter ending index  : ");
        int ei= sc.nextInt();
       // System.out.println(substring1(str,si,ei));
       System.out.println(str.substring(si,ei););
    }
}
