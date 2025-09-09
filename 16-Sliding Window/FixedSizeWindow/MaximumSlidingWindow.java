import java.util.*;

class MaximumSlidingWindow {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int i = 0; 
        int j = 0; 
        int[] ans = new int[nums.length - k + 1];
        Deque<Integer> q = new LinkedList<>();
        
        while (j < nums.length) {
            // Remove all smaller elements (they are useless)
            while (!q.isEmpty() && q.peekLast() < nums[j]) {
                q.removeLast();
            }
            q.addLast(nums[j]);

            // If window not yet of size k
            if (j - i + 1 < k) {
                j++;
            } 
            // If window of size k
            else if (j - i + 1 == k) {
                ans[i] = q.peekFirst();  // front is max
                if (q.peekFirst() == nums[i]) { 
                    q.removeFirst();     // remove element going out
                }
                i++;
                j++;
            }
        }
        return ans;
    }

    // Main method to test
    public static void main(String[] args) {
      
        int[] nums = {1, 3, -1, -3, -5, 3, 6, 9};
        int k = 3;
        
        int[] result = maxSlidingWindow(nums, k);
        
        System.out.println("Sliding Window Maximums:");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
