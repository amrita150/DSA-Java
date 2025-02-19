public class Factorial {
    public static int  factorial(int n){
        //base case
        if(n==1){
            return 1;
        }
        int fact = n*factorial(n-1);
        return fact;
    }

    public static void main(String[] args){
        int n = 5;
        int res = factorial(n);
        System.out.println("factorial of n number is: " + res);
    }
}
