public class PrintNto1 {
    public static void print(int n){
        //base case
        if(n==0){
            return;
        }
        System.out.print(n + " ");
        print(n-1);
    } //tail recursion
    
    public static void main(String[] args) {
        int n = 10;
        print(n);
    }    
}