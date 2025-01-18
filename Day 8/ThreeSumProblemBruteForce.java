// find unique triplets whose sum is zero
import java.util.*;
public class ThreeSumProblemBruteForce {
    //Brute force approach
    public static List<List<Integer>> threeSum(int arr[]) {
       Set<List<Integer>> st = new HashSet<>(); // Set to store unique triplets
       int n = arr.length;

       // Iterate through all possible triplets
       for(int i = 0; i < n; i++) {
           for(int j = i + 1; j < n; j++) {
               for(int k = j + 1; k < n; k++) {
                   // If sum of the triplet is zero, add to set
                   if(arr[i] + arr[j] + arr[k] == 0) {
                       //adding into the list, using asList method
                       List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                       temp.sort(null); // Sort to avoid duplicates
                       st.add(temp); // Add to set
                   }
               }
           }
       }
       
       // Convert set to list and return
       List<List<Integer>> ans = new ArrayList<>(st);
       return ans;
    } // time complexity i O(n^3)

    public static void main(String[] args) {
        int arr[] = {-1, 0, 1, 2, -1, 4}; 
        List<List<Integer>> res = threeSum(arr);
        
        System.out.print("[");
        // Print each triplet
        for(List<Integer> lt : res) {
            System.out.print("[");
            for(Integer i : lt) {
                System.out.print(i + " ");
            }
            System.out.print("]");
        }
        System.out.print("]");
    }
}
