import java.util.Scanner;

class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DeleteNodeInDLL {
    public static Node head;
    public static Node tail;
    public static Node deleteNode(Node head, int x) {
        if(head == null){
            return null;
        } else if(x==1){
            if (head.next != null) head.next.prev = null; 
        return head.next;  
        } 
        Node temp = head;
        for(int i =1; i<x;i++){
            if(temp==null) return head;
            temp = temp.next;
        } 
            
        if(temp.next==null){
            temp.prev.next = null;
        } else{
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;}
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
        System.out.println("enter loc where you want to dlt (starting from 1)");
        int loc = sc.nextInt();
        head = deleteNode(head,loc);
        display(head);
    }
}
