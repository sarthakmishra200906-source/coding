package java.devideandconcure;

public class basic {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergSort(int arr[],int si,int ei){
        //kaam
        int mid=si+(ei-si)/2;
        mergSort(arr, si, mid);
        mergSort(arr, mid+1, ei);
        merg(arr, si, mid, ei);
    }
    public static void merg(int arr[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si;//left part itrater
        int j=mid+1;//right part itrater
        int k=0;//temp itrater
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){//left part
            temp[k++]=arr[i++];
        }
        while(j<=ei){//right part
            temp[k++]=arr[j++];
        }
        //copy temp to original
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
    public static void main(String[] args){
        int arr[]={1,2,8,7,5,4,3,6};
        printArray(arr);
        mergSort(arr, 0, arr.length-1);
        printArray(arr);
    }
}
