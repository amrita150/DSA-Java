import java.util.*;
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class InsertAtLocDLL{
    public static Node head;
    public static Node tail;
    // Function to insert a new node at position p
    static Node addNodeAtLoc(Node head, int p, int x) {
        Node newNode = new Node(x);
        Node temp = head;

        // Traverse the list to find the position
        for (int i = 0; i < p; i++) {
            if (temp == null) return head;  // If position is invalid, return original list
            temp = temp.next;
        }

        // Insert the new node
        newNode.next = temp.next;
        if (temp.next != null) {
            temp.next.prev = newNode;
        }
        temp.next = newNode;
        newNode.prev = temp;

        return head;
    }

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

    // Function to display the doubly linked list
    static void display(Node head) {
        Node temp = head;
        System.out.print("Doubly Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
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
        // Display original list
        display(head);
        System.out.println("after inserting 25 after loc 2");
        head = addNodeAtLoc(head, 2, 25);
        display(head);
    }
}
