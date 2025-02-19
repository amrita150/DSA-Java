//Check if a pair with given sum exists in Array 
import java.util.*;

public class TwoSum {
    //brute force approach
    public static boolean twoSum(int arr[], int target){
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==target){
                    return true;
                }
            }
        }
        return false;
    } //time complexity is O(n^2)

    //optimized approach 
    //using two pointers 
    //first sort the array
    public static boolean twoSumm(int arr[], int target){
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length - 1;
        while(i<j){
            if(arr[i]+arr[j]==target){
                return true;
            } else if(arr[i]+arr[j]<target){
                i++;
            } else{
                j--;
            }
        }
        return false;
    } //time complexity O(nlogn) + O(n)

    public static void main(String args[]){
        int arr[] = {3,4,3,1,10,7};
        int target = 6;
        System.out.println("brute Force Approach: " + twoSum(arr,target));
        System.out.println("Optimized Approach: " + twoSumm(arr,target));
    }
}
