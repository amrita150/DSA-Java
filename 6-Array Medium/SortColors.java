import java.util.Arrays;
class SortColors{
    //using sort method
    public static void sortColors(int arr[]){
        Arrays.sort(arr);
    } //time complexity O(nlogn)

    //better approach
    public static void sortColorsBetterApproach(int arr[]){
        int n = arr.length;
        int countZeroes = 0, countOnes = 0, countTwoes = 0;
        for(int i=0; i<n; i++){
            if(arr[i]==0){
            countZeroes++;}
            else if(arr[i]==1){
            countOnes++;}
            else{
            countTwoes++;}
        }
        int j =0;
        while(countZeroes!=0){
            arr[j++] = 0;
            countZeroes--;
        }
        while(countOnes!=0){
            arr[j++] = 1;
            countOnes--;
        }
        while(countTwoes!=0){
            arr[j++] = 2;
            countTwoes--;
        }
    }

    // Dutch National Flag Problem (Optimal approach)
    // using this we can sort the colors in single pass
    public static void dutchFlagProb(int arr[]) {
        int left =0;
        int mid = 0;
        int right = arr.length -1;
        int n = arr.length;
        while(mid<=right){
            if(arr[mid]==0){
                int temp = arr[mid];
                arr[mid] = arr[left];
                arr[left]=temp;
                mid++;
                left++;
            } 
            else if(arr[mid]==1){
                mid++;
            } else{
                    int temp = arr[mid];
                    arr[mid] = arr[right];
                    arr[right]=temp;
                    right--;
            }
        }
    }

    public static void printArray(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,1,2,0,1,2,0,1,0};
        dutchFlagProb(arr);
        printArray(arr);
    }
}