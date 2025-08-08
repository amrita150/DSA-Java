public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int k = 0; // index to place non-val elements
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k++] = nums[i];
            }
        }
        return k; // number of elements after removal
    }

    public static void main(String[] args) {
       int[] nums = {3, 2, 2, 3, 4, 3};
        int val = 3;

        int k = removeElement(nums, val);

        System.out.println("New length: " + k);
        System.out.print("Array after removal: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
