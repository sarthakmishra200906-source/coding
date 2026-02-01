import java.util.*;
public class twodarr {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in );
    System.out.println("Enter your colum of matrix : ");
    int n=sc.nextInt();
    System.out.println("ENter your row of matrix ");
    int m = sc.nextInt();
    int arr1[][]=new int [m][n];
    for(int i= 0 ;i<m;i++){
        for(int j=0 ;j<n;j++){
            arr1[i][j]=sc.nextInt();
        }
        
    }
    for(int i = 0 ; i<m ;i++){
        for(int j= 0 ;j<n;j++){
            System.out.print(arr1[i][j] + " ");
        }
        System.out.println();
    }
    sc.close();

}
}
