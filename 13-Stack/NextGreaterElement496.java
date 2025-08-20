import java.util.*;
//leetcode problem 
class NextGreaterElement496 {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();

        for (int i = nums2.length - 1; i >= 0; i--) {
            int num = nums2[i];

            while (!st.isEmpty() && st.peek() <= num) {
                st.pop();
            }

            if (st.isEmpty()) {
                map.put(num, -1);
            } else {
                map.put(num, st.peek());
            }

            st.push(num);
        }

        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.get(nums1[i]);
        }

        return result;
    }

    public static void main(String[] args) {
         int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};

        int[] result = nextGreaterElement(nums1, nums2);

        System.out.println(Arrays.toString(result));
    }
}
