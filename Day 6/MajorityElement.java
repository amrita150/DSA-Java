//majority Element >N/2
import java.util.HashMap;

class MajorityElement {
    //brute force
    public static int majorityElementBruteAppro(int[] arr){
        int n = arr.length;
        int count =0;
        for (int i = 0; i < n; i++) {
            for(int j = 0; j<n; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>(n/2)){
                return arr[i];
            }
        }
        return -1;
    } //time complexity is O(n^2)

    //better approach
    //using hashmap
    public static int majorityElementBetterAppr(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int i =0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            } else{
                map.put(arr[i], 1);
            } 
            if(map.get(arr[i]) > (arr.length/2)){
                return arr[i];
            }
        }
        return -1;
    } //time complexity O(n) and space is O(n)

    //optimal solution 
    //using moose algo
    public static int majorityElement(int[] arr) {
        int count = 0;
        int ele = 0;
        //applying moose algo
        for(int i =0; i<arr.length; i++){
            if(count==0){
                count = 1;
                ele = arr[i];
            } else if(ele==arr[i]){
                count++;
            } else{
                count--;
            }
        }

        //for checking if ele is majority element or not
        int count1 = 0;
        for(int i =0; i<arr.length; i++){
            if(arr[i]==ele){
                count1++;
            }
        }
        if(count1>(arr.length/2)){
            return ele;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {4,4,2,4,3,4,4,3,2,4};
        System.out.println("Majority element is: " + majorityElement(arr));
    }
}
