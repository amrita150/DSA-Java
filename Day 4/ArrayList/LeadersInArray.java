import java.util.*;

public class LeadersInArray{
    //brute force approach
    public static ArrayList<Integer> leaderFind(int arr[]){
        ArrayList<Integer> res = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i <n; i++) {
            int j;
            for(j = i; j<n ; j++){
                if(arr[i]<arr[j]){
                    break;
                }
            }
            if(j==n){
                res.add(arr[i]);
            }
        }
        return res;
    }//time complexity is O(n^2) and space complexity is O(n)
    //we can also simplly print the value without using the arraylist

    //optimized approach 
    public static ArrayList<Integer> leadersFind(int arr[]){
        ArrayList<Integer> res = new ArrayList<>();
        int n = arr.length;
        int max = arr[n-1];
        res.add(max);
        for(int i =n-2; i>-1; i--){
            if(arr[i]>max){
                res.add(arr[i]);
                max = arr[i];
            }
        }
        Collections.reverse(res);
        return res;
    } // time complexity and space complexity is O(n) 
    public static void main(String[] args) {
        int arr[] = {7,10,4,3,6,5,2};
        System.out.println("Leaders using brute force:");
        ArrayList<Integer> resBrute = leaderFind(arr);
        for (int num : resBrute) {
            System.out.print(num + " ");
        }
        
        System.out.println("\nLeaders using optimized approach:");
        ArrayList<Integer> resOptimized = leadersFind(arr);
        for (int num : resOptimized) {
            System.out.print(num + " ");
        }
    }
}