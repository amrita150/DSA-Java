public class Print1toN {
    public static void print(int n){
        //base case
        if(n==0){
            return;
        }
        print(n-1);
        System.out.print(n + " ");
    } //head recursion

//Time Complexity: O(N) { Since the function is being called n times, 
//and for each function, we have only one printable line that takes 
//O(1) time, so the cumulative time complexity would be O(N) }

//Space Complexity: O(N) { In the worst case, the recursion 
//stack space would be full with all the function calls waiting to get 
//completed and that would make it an O(N) recursion stack space }.
    public static void main(String[] args) {
        int n = 10;
        print(n);
    }    
}
