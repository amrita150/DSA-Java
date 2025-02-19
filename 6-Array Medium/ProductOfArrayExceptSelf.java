//product of array except itself
public class ProductOfArrayExceptSelf {
    
    //brute force approach
    public static int[] productOfArrayBruteForce(int arr[]){
        int n = arr.length;
        int ans[] = new int[n];
        for(int i=0; i<n;i++){
            int product = 1;
            for(int j=0; j<n; j++){
                if(i!=j){
                    product *= arr[j];
                }
            }
            ans[i] = product;
        }
        return ans;
    } //time complexity is O(n^2)

    //better approach
    //using prefix and suffix array
    public static int[] productOfArrayBetter(int arr[]){
        int n = arr.length;
        int prefix[] = new int[n];
        int suffix[] = new int[n];
        int ans [] = new int[n];
        
        //for prefix, store left product
        prefix[0] = 1;
        for(int i=1; i<n;i++){
            prefix[i] = arr[i-1]*prefix[i-1];
        }

        //for suffix, product of right
        suffix[n-1] = 1;
        for (int j = n-2; j>=0; j--) {
            suffix[j] = arr[j+1]*suffix[j+1]; 
        }

        //main loop where value store
        for(int k = 0; k<n; k++){
            ans[k] = prefix[k]*suffix[k];
        }
        return ans;
    }//here space complexity become O(3n) and time complexity O(n)

    //optimized approach, without using prefix and suffix array
    public static int[] productOfArrayOptimal(int arr[]){
        int n = arr.length;
        int ans[] = new int[n];
        //lets do the prefix in ans array
        ans[0] = 1;
        for(int i=1; i<n;i++){
            ans[i] = arr[i-1]*ans[i-1];
        }
        //now for suffix, lets take a suffix variable
        int suffix = 1;
        for(int i =n-2; i>=0; i--){
            suffix = suffix*arr[i+1];
            ans[i] = suffix*ans[i];
        }
        return ans;
    } //time complexity is O(n) and space complexity is O(n)
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int arr2[] = {-1,1,0,-3,3};
        int ans[] = productOfArrayOptimal(arr2);
        for(int i =0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
