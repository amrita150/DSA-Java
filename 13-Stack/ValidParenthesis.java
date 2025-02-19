import java.util.*;
public class ValidParenthesis {

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            } else{
                if(st.isEmpty()){
                    return false;
                }
                char top = st.peek();
                 if ((ch == ')' && top == '(') ||
                    (ch == '}' && top == '{') ||
                    (ch == ']' && top == '[')) {
                    st.pop();
            } else{
                return false;
            }
        }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        String s = new String("[]{)}");
        if(isValid(s)){
            System.out.println("yes string has valid parenthesis");
        } else{
            System.out.println("No it does not have valid parenthesis");
        }
    }
}