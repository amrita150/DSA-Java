//LeetCode problem Link : https://leetcode.com/problems/merge-sorted-array/description/
public class MergeSortedArray {
    
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while(j>=0){
            if(i>=0 && nums1[i]>nums2[j]){
                nums1[k--] = nums1[i];
                i--;
            } else{
                nums1[k--] = nums2[j];
                j--;
            }
        }
    }

    public static void printArray(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]){
        int nums1[] = {1,2,3,0,0,0} ,  m = 3;
        int nums2[] = {2,5,6},  n = 3;
        merge(nums1, m, nums2, n);
        printArray(nums1);
    }
}
