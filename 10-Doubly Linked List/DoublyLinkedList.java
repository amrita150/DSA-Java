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

public class DoublyLinkedList {
    public static Node head;
    public static Node tail;
    public static void insertAtBeg(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            tail = newNode;
        } else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
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
    }
}
