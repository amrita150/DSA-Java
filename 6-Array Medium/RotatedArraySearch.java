public class RotatedArraySearch {
    public static int search(int[] arr, int target) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            // Check which part is sorted
            // Left part sorted
            else if (arr[start] <= arr[mid]) {
                // Check if target lies between start and mid
                if (arr[start] <= target && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            // Right part sorted
            else {
                // Check if target lies between mid and end
                if (arr[mid] < target && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) { 
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;        
        int result = search(nums, target);
        System.out.println("Index of target " + target + ": " + result);
    }
}

