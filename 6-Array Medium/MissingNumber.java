public class MissingNumber {
    // Better approach using hashmap-like array
    public static int missingNumBetter(int arr[]){
        int n = arr.length;
        int hash[] = new int[n+1];
        for(int i=0; i<n;i++){
            hash[arr[i]]++;
        }
        for(int i =0; i<=n; i++){
            if(hash[i]==0){
                return i;
            }
        }
        return -1;
    } 
   // Optimal solution I using sum formula
    public static int missingNumOpti(int arr[]){
        int n = arr.length;
        int sumOfNat = n*(n+1)/2;
        int sum = 0;
        for(int i =0; i<n; i++){
            sum += arr[i];
        }
        return (sumOfNat - sum);
    } 
    //optimal solution II using Xor
    public static int missingNum(int arr[]){
        //using bitwise XOR operator
        int Xor1 = 0;// XOR of array elements
        int Xor2 = 0;// XOR of numbers from 0 to n
        for(int i =0; i<arr.length; i++){
            Xor1 = Xor1^arr[i];
            Xor2 = Xor2^(i); 
        }
        Xor2 = Xor2^(arr.length);
        return (Xor1^Xor2);
    } 
    public static void main(String[] args){
        int arr[] ={3,0,1,2,5};
        System.out.println("Better Approach: " + missingNumBetter(arr));
        System.out.println("Optimal Solution I: " + missingNumOpti(arr));
        System.out.println("Optimal Solution II: " + missingNum(arr));
    }
}
