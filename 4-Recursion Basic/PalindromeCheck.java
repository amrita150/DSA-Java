public class PalindromeCheck {
    public static boolean palinCheck(String str,int i, int j){
        if(i>=j){
            return true;
        }
        if(str.charAt(i)!=str.charAt(j)){
            return false;
        }
        return palinCheck(str, i+1, j-1);
    }
    public static void main(String args[]){
        String str = new String("abbcba");

        System.out.println(palinCheck(str, 0, str.length()-1));
    }
}
