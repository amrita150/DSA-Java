package FixedSizeWindow;
import java.util.*;
public class FirstNegativeInWindow {
     static List<Integer> firstNegInt(int arr[], int k) {
        Deque<Integer> neg = new LinkedList<>();
        List<Integer> res = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (j < arr.length) {
            if (arr[j] < 0) {
                neg.addLast(arr[j]);
            }
            if (j - i + 1 < k) {
                j++;    
            } else if (j - i + 1 == k) {
                if (neg.isEmpty()) {
                    res.add(0);
                } else {
                    res.add(neg.peekFirst());
                }
                if (!neg.isEmpty() && arr[i] == neg.peekFirst()) {
                    neg.pollFirst();
                }
                i++;
                j++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, 15, 30, 16, 28};
        int k = 3;
        List<Integer> result = firstNegInt(arr, k);
        System.out.println("First negative in each window of size " + k + ":");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
