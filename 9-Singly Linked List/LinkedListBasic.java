//without using tail
import java.util.*;
class Node{
    //each node contain
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedListBasic{
    public static Node head;
    public static void insertAtBeg(int data){
        Node newNode = new Node(data);
        //case 1, if linkedList is empty
        if(head==null){
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public static void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
        } else {
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public static void displayNode(Node head){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while(temp.next != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print(temp.data);
    }

    public static void main(String[] args) {
        System.out.print("Enter size of your Linked List: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.print("Enter elements of Linked List: ");
        for(int i=0; i<size; i++){
            int data = sc.nextInt();
            insertAtEnd(data);
        }
        displayNode(head);
    }
}