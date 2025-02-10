import java.util.*;
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class CircularLLBasic {
    public static Node head;
    public static void addAtBeg(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            newNode.next = newNode;
        }
        Node temp = head;
        newNode.next = head;
        while(temp.next!=head){
            temp = temp.next;
        } 
        temp.next = newNode;
        head = newNode;
    }

    public static void addAtEnd(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            newNode.next = newNode;
        }
        Node temp = head;
        while(temp.next!=head){
            temp = temp.next;
        } 
        temp.next = newNode;
        newNode.next = head;
    }

    public static Node deleteHead(Node head){
        Node temp = head;
        while(temp.next!=head){
            temp = temp.next;
        }
        temp.next = head.next;
        head = head.next;
        
        return head;
    }

    public static void displayNode(Node head){
        if(head==null){
            System.out.println("the list is empty");
        }
        Node temp = head;
        while(temp.next!=head){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
    public static void main(String[] args) {
        System.out.print("Enter size of LL: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("Enter elements of circular linked list");
        for(int i=0; i<size;i++){
            int data = sc.nextInt();
            addAtBeg(data);
        }
        addAtEnd(6);
        displayNode(head);
        Node res = deleteHead(head);
        displayNode(res);
    }
}
