class Stack{
    int arr[] = new int[1000];
    int top = -1;

    void push(int x){
        top++;
        arr[top] = x;
    }

    int pop(){
        if(top==-1){
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top--];
    }

    boolean isEmpty(){
        return top == -1;
    }
}

public class StackBasic {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(4);
        s.push(5);
        s.push(1);
        while(!s.isEmpty()){
            System.out.print(s.pop() + " ");
        }
    }
}
