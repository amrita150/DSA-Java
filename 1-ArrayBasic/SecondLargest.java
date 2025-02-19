import java.util.Arrays;

public class SecondLargest {

    //brute force approach
    public static int secondLargest(int arr[]){
        Arrays.sort(arr);
        int secondLar = arr[arr.length - 2];
        return secondLar;
    } //time complexity is O(n*logn)

    //optimistic approach 
    public static int secLarge(int arr[]){
        if(arr.length == 0 || arr.length == 1){
            return -1;
        }
        int max = arr[0];
        int secMax = -1;
        for(int i = 0; i< arr.length; i++){
            if(arr[i]>max){
                secMax = max;
                max = arr[i];
            } else if(arr[i]>secMax && arr[i]<max){
                secMax = arr[i];
            }
        }
        return secMax;
    }//time complexity of this is O(n)
    public static void main(String args[]){
        int arr[] = {8,1,4,6,9,108,5,11};
        System.out.println("Second Largest element is: "+ secondLargest(arr));
        System.out.println("Second Largest element is: "+ secLarge(arr));

    }
}
