public class SumOfDigit {
    public static int sumOfDigit(int num){
        if(num==0)
            return 0;
        return sumOfDigit(num/10) + num%10;
    }
    public static void main(String args[]){
        int num = 456778;
        System.out.println(sumOfDigit(num));
    }
}
