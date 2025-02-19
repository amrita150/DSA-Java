class FindMinInRoatedArray {
    public static int findMin(int[] arr) {
        int start = 0;
        int end = arr.length -1;
        while(start<end){
            int mid = (end+start)/2;
            if(arr[mid]>arr[end]){
                start = mid +1;
            } else{
                end = mid;
            }
        }
        return arr[start];   
    }
    public static void main(String[] args) { 
        int[] nums = {4, 5, 6, 7, 0, 1, 2};     
        int result = findMin(nums);
        System.out.println("Min value is: " + result);
    }
}