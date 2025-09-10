import java.util.*;

public class RemoveDuplicateFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        int curr = nums[0];
        int cnt = 0;
        int i = 0, j = 0;

        while (i < n) {
            if (nums[i] == curr) {
                if (cnt < 2) {
                    nums[j] = nums[i];
                    j++;
                    cnt++;
                }
            } else {
                curr = nums[i];
                cnt = 1;
                nums[j] = curr;
                j++;
            }
            i++;
        }

        return j;
    }

    // Main function to test the code
    public static void main(String[] args) {
     
        int[] nums = {0,0,1,1,1,1,2,3,3};
        int newLength = removeDuplicates(nums);

        System.out.println("New Length: " + newLength);
        System.out.print("Modified Array: ");
        for (int k = 0; k < newLength; k++) {
            System.out.print(nums[k] + " ");
        }
    }
}
