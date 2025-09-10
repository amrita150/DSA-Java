import java.util.*;

public class SubarraySumEqualK {

    // Function to count subarrays with sum = k
    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int[] ps = new int[n];
        ps[0] = nums[0];

        for (int i = 1; i < n; i++) {
            ps[i] = ps[i - 1] + nums[i];
        }

        int count = 0;

        for (int j = 0; j < n; j++) {
            if (ps[j] == k) count++;
            int val = ps[j] - k;
            if (map.containsKey(val)) {
                count += map.get(val);
            }
            map.put(ps[j], map.getOrDefault(ps[j], 0) + 1);
        }

        return count;
    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3};  // Example input
        int k = 3;

        int result = subarraySum(nums, k);
        System.out.println("Number of subarrays with sum " + k + ": " + result);
    }
}

