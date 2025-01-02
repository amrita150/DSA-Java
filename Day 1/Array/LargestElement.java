import java.util.*;
public class LargestElement {

    public static int largest(int arr[], int n){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
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
       System.out.println("largest element is: " + largest(arr,n));
        sc.close();
    }
}
