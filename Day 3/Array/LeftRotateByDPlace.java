import java.util.*;
public class LeftRotateByDPlace {    
    
    //brute force approach
    //use a temporary array
    public static void leftRotateByD(int arr[], int pos){
        int temp[] = new int[arr.length];
        int j =0;
        for(int i = pos; i<arr.length;i++){
            temp[j++] = arr[i];
        }
        int k = arr.length -pos;
        for(int i= 0; i<pos;i++){
            temp[k++] = arr[i];
        }
        printArray(temp);
    } //time complexity O(n) and Space Complexity also O(n)


    //optimized Approach
    //swap pos to n and 0 to pos - 1 then swap whole array
    public static void reverse(int arr[], int start, int end){
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void leftRotateByDPlace(int arr[], int pos){
           while(pos>arr.length-1){
            pos = pos - arr.length;
           }
            reverse(arr, 0 , pos-1);
            reverse(arr, pos , arr.length-1);
            reverse(arr, 0, arr.length-1);
    } //time complexity O(n)

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,5,2,4,6,1,7};
        System.out.print("No. of places to rotate: ");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        leftRotateByD(arr,k);

        int arr1[] = {3,5,2,4,6,1,7};
        leftRotateByDPlace(arr1,k);
        System.out.println("\nOptimized solution: ");
        printArray(arr1);
        sc.close();
    }    
}
