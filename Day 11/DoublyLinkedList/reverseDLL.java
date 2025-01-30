import java.util.*;
class Node{
    int data;
    Node next;
    Node prev;

    public Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class reverseDLL {
    public static Node head;
    public static Node tail;

    //brute force approach
    public static Node reverseDLL(Node head) {
        Stack<Integer> st = new Stack<>();
        Node temp = head;
        while(temp!=null){
            st.push(temp.data);
            temp = temp.next;
        } 
        
        temp = head;
        while(temp!=null){
            temp.data = st.pop();
            temp = temp.next;
        }
        return head;
    } // time complexity is O(n) and space complexity is O(n)

    //optimized approach
    public static Node reverseDoublyLL(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node back = null;
        Node curr = head;
        while(curr!=null){
            back = curr.prev;
            curr.prev = curr.next;
            curr.next = back;
            curr = curr.prev;
        }
        return back.prev;
    }//time complexity = O(n)

    public static void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            tail = newNode;  
        } else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public static void displayNode(Node head){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while(temp.next != null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.print(temp.data);
    }

    public static void main(String[] args) {
        System.out.print("Size of LinkedList: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.print("Enter elements of Linked List: ");
        for (int i = 0; i < size; i++) {
            int data = sc.nextInt();
            insertAtEnd(data);
        }
        displayNode(head);
        System.out.println("\nAfter reverse the LL is");
        Node res = reverseDoublyLL(head);
        displayNode(res);
    }
}




