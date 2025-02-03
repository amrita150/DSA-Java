import java.util.*;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DeleteNthNodeFromEnd {
    public static Node head;

    // Recursive search function
    public static Node removeNthFromEnd(Node head, int n) {
        //find size
        int size = 0;
        Node temp = head;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        if(size==n){
            head = head.next;
            return head;
        }
        int loc = size -n;
        temp = head;
        for(int i=1; i<loc;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }

    // Display Linked List
    public static void displayNode(Node head) {
        if (head == null) {
            System.out.println("List is empty");
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
        // Creating a sample linked list
        head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(7);
        head.next.next.next = new Node(6);
        head.next.next.next.next = new Node(9);

        System.out.println("Linked List:");
        displayNode(head);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter pos of element you want to delete from end: ");
        int target = sc.nextInt();
        Node res = removeNthFromEnd(head,target);

        displayNode(res);
    }
}
