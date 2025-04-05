// find unique triplets whose sum is zero
import java.util.*;
public class ThreeSumOptimalSolution {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        // Step 1: Sort the array
        Arrays.sort(nums);

        // Step 2: Loop through each element as the first element of the triplet
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicates for the first element
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;
            int target = -nums[i]; // We want nums[left] + nums[right] = -nums[i]

            // Step 3: Two-pointer search
            while (left < right) {
                int sum = nums[left] + nums[right];

                if (sum == target) {
                    // Found a valid triplet
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    // Skip duplicates for left and right after adding triplet
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                }
                else if (sum < target) {
                    left++; // Need a larger sum
                }
                else {
                    right--; // Need a smaller sum
                }
            }
        }

        return result;
    }

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
