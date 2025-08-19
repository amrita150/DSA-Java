import java.util.Stack;

public class ReverseStack {
    static void reverse(Stack<Integer> St) {
        if (St.isEmpty()) {
            return;
        }

        int ele = St.pop();
        reverse(St);
        pushAtBottom(St, ele);
    }

    static void pushAtBottom(Stack<Integer> s, int element) {
        if (s.isEmpty()) {
            s.push(element);
            return;
        }

        int ele = s.pop();
        pushAtBottom(s, element);
        s.push(ele);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        // Push some elements
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        System.out.println("Original Stack: " + st);

        // Reverse the stack
        reverse(st);

        System.out.println("Reversed Stack: " + st);
    }
}
