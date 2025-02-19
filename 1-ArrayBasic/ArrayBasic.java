import java.util.*;
public class ArrayBasic{

    public static void traverse(int arr[], int n){
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
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
        sc.close();
    }
}