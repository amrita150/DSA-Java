public class NextPermutation {
    public static void nextPermutation(int[] arr) {
        int n = arr.length;
        int pivot = -1;
        
        // Step 1: Find the pivot (first decreasing element from the right)
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                pivot = i;
                break;
            }
        }

        // Step 2: If no pivot found, reverse the whole array (last permutation case)
        if (pivot == -1) {
            reverse(arr, 0, n - 1);
            return;
        }

        // Step 3: Find the next larger element to swap with pivot
        int minIndex = pivot + 1;
        for (int i = n - 1; i > pivot; i--) {
            if (arr[i] > arr[pivot]) {
                minIndex = i;
                break;
            }
        }

        // Swap pivot and next larger element
        swap(arr, pivot, minIndex);
        
        // Step 4: Reverse the elements after pivot
        reverse(arr, pivot + 1, n - 1);
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1};
        nextPermutation(arr);
        printArray(arr);
    }
}
