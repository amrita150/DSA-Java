class Stack{
    class StackNode{
        int data;
        StackNode next;
    
       public StackNode(int data){
        this.data = data;
        this.next = null;
       }
    }

    public StackNode top;

    void push(int val){
        StackNode newNode = new StackNode(val);
        newNode.next = top;
        top = newNode;
    }

    int pop() {
        if(top==null){
            return -1;
        } 
        int temp = top.data;
        top = top.next;
        return temp;
    }

    void printStack() {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            StackNode temp = top;
            while (temp != null) {
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
        }
    }
}


public class StackUsingLinkedList {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(4);
        s.push(5);
        s.push(1);
        s.printStack();
    }
}
