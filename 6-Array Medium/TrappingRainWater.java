public class TrappingRainWater {
    //using prefix and suffix array
    public static int trappingRainWater(int arr[]){
        int leftMax[] = new int[arr.length];
        int rightMax[] = new int[arr.length];
        int n = arr.length;
        leftMax[0]= arr[0];
        for(int i=1; i<n ; i++){
            leftMax[i]=Math.max(arr[i],leftMax[i-1]);
        }
        rightMax[n-1]=arr[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i]=Math.max(arr[i],rightMax[i+1]);
        }
        int res =0;
        for (int i = 0; i < n; i++) {
            res = res + Math.min(leftMax[i],rightMax[i]) - arr[i];
        }
        return res;
    } //space complexity is O(n) and time complexity is O(n)

    //optimal solution is using two pointers
    public static int trappingRainWaterOptimalSol(int arr[]){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        int leftMax = arr[0];
        int rightMax = arr[n-1];
        int res =0;
        while(left<=right){
            if(arr[left]<=arr[right]){
            if(arr[left]>=leftMax){
                leftMax = arr[left]; 
            } else{
                res = res + leftMax - arr[left];
            }
            left++;
        } else{
            if(arr[right]>=rightMax){
                rightMax = arr[right]; 
            } else{
                res = res + rightMax - arr[right];
            }
            right--;
        }
      }
      return res;
    }//space complexity is O(1) and time complexity is O(n)
    public static void main(String args[]){
        int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("Result using prefix/suffix arrays: " + trappingRainWater(arr));
        System.out.println("Result using two-pointer optimal solution: " + trappingRainWaterOptimalSol(arr));

    }
}
