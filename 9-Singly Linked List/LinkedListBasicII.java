import java.util.*;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedListBasicII {
    public static Node head;
    public static Node tail;
   public static void insertAtBeg(int data){
    Node newNode = new Node(data);
    if(head==null){
        head = newNode;
        tail = newNode;
    } else{
        newNode.next = head;
        head = newNode;
    }
   }

    public static void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public static void displayNode(Node head) {
        if (head == null) {
            System.out.println("The linked list is empty.");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.print("Enter size of your Linked List: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        System.out.print("Enter elements of Linked List: ");
        for (int i = 0; i < size; i++) {
            int data = sc.nextInt();
            insertAtBeg(data);
        }

        System.out.println("The Linked List is:");
        displayNode(head);
    }
}
