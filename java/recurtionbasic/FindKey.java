import java.util.*;
public class FindKey {
    public static int find(int arr[],int a,int i){
        if (i==arr.length){
            return -1;
        }
        if(arr[i]==a){
            return i;
        }
         return find(arr, a, i+1);
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your key you want to find in array : ");
        int a=sc.nextInt();
        int arr[]={1,2,3,4,5,6,8,7};
       int result = find(arr,a,0);
       if(result==-1){
        System.out.println("key dose not exists");
       }else{
       System.out.println("your key position is " + result);
       }
    }
}
