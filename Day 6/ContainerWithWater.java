class ContainerWithWater {
    //brute force approach
    public static int maxAreaBruteForce(int[] height){
        int n = height.length;
        int water = 0;
        for(int i =0; i<n; i++){
            for(int j = i+1; j<n; j++){
                water = Math.max(water, Math.min(height[i],height[j])*(j-i));
            }
        }
        return water;
    }// time complexity of this approach is O(n^2)

    //optimal approach
    //using two pointer
    public static int maxAreaOptimized(int[] height) {
        int left = 0;
        int right = height.length -1 ;
        int res = 0;
        while(left<right){
            res = Math.max(Math.min(height[left],height[right])*(right-left), res);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return res;
    }// time complexity of this approach is O(n)

    public static void main(String[] args) {
        int arr[] = {2,3,10,5,7,8,9};
        int arr1[] = {8,7,2,1};
        System.out.println("MaxArea is: " + maxAreaOptimized(arr));
        System.out.println("MaxArea is: " + maxAreaBruteForce(arr1));
    }
}
