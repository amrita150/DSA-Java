import java.util.Stack;

class ReverseString {
    public void reverseString(char[] s) {      
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length; i++) {
            st.push(s[i]);
        }

        int i = 0;
        while (!st.isEmpty()) {
            char ele = st.pop();
            s[i++] = ele;
        }
    }

    public static void main(String[] args) {
        ReverseString obj = new ReverseString();

        String str = "hello";
        char[] arr = str.toCharArray();

        System.out.println("Original String: " + str);

        obj.reverseString(arr);

        String reversed = new String(arr);
        System.out.println("Reversed String: " + reversed);
    }
}
