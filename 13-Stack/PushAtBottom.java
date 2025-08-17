import java.util.Stack;

class PushAtBottom {
    // Function to insert element at the bottom of stack
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        Stack<Integer> s = new Stack<>();
        
        if (st.isEmpty()) {
            st.push(x);
            return st;
        }

        // Pop all elements from original stack into temporary stack
        while (!st.isEmpty()) {
            int ele = st.pop();
            s.push(ele);
        }

        // Push x at the bottom
        st.push(x);

        // Restore the elements back
        while (!s.isEmpty()) {
            int ele = s.pop();
            st.push(ele);
        }

        return st;
    }

    public static void main(String[] args) {
        PushAtBottom piishAtbottom = new PushAtBottom();
        Stack<Integer> stack = new Stack<>();

        // Example stack elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Original Stack: " + stack);

        // Insert at bottom
        piishAtbottom.insertAtBottom(stack, 5);

        System.out.println("After inserting 5 at bottom: " + stack);
    }
}
