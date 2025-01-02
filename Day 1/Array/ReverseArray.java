import java.util.*;
public class ReverseArray{
    public static void reverse(int arr[], int n){
        int i = 0;
        int j = n-1;
       while(i<j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j] = temp;
        i++;
        j--;
       }
    }
    public static void traverse(int arr[], int n){
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of an array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter elements of an array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        } 
        System.out.println("Elements of an array are: ");
        traverse(arr, n);
        reverse(arr,n);
        System.out.println("Array after reverse: ");
        traverse(arr,n);
    }
}