public class MaxSubarraySumK {
    public static int maximumSumSubarray(int[] arr, int k) {
        int n = arr.length;
        int i = 0, j = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;

        while (j < n) {
            sum += arr[j];

            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                max = Math.max(max, sum);
                sum -= arr[i]; //slide window
                i++;
                j++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 8, 2, 9, 1};
        int k = 3;

        int result = maximumSumSubarray(arr, k);
        System.out.println("Maximum sum of subarray of size " + k + " is: " + result);
    }
}
