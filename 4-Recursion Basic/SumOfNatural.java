public class SumOfNatural {
    public static int sumOfNatural(int n){
        //base case
        if(n==1){
            return 1;
        }
        int sum = n + sumOfNatural(n-1);
        return sum;
    }

    public static void main(String[] args){
        int n = 10;
        int res = sumOfNatural(n);
        System.out.println("Sum of n natural number is: " + res);
    }
}
