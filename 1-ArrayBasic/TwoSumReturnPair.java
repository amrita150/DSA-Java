//Given an array of integers nums and an integer target, 
//return indices of the two numbers such that they add up to target.

import java.util.HashMap;

//for this we use hashmap
public class TwoSumReturnPair {
    public static int[] twoSum(int arr[], int target){
        HashMap<Integer, Integer> arr1 = new HashMap<>();
        for(int i =0; i<arr.length; i++){
            int num = arr[i];
            int diff = target - num;
            if(arr1.containsKey(diff)){
                return new int[] {num,diff};
            } 
            arr1.put(arr[i],i);
        }
        return new int[] {-1,-1};
    }//time complexity is O(n) and space complexity is O(n)
    public static void main(String[] args) {
        int arr[] = {3,4,3,1,10,7};
        int target = 7;
        int res[] = twoSum(arr,target);
        if (res[0] != -1) {
        System.out.println("target elements are : " + "{" + res[0] + "," + res[1] + "}" );
        } else{
            System.out.println("No elements are found!");
        }
    }    
}
