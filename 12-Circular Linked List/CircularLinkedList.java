
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class CircularLinkedList {
    public static Node head;
    public static void displayNode(Node head){
        if(head==null){
            System.out.println("the list is empty");
        }
        Node temp = head;
        while(temp.next!=head){
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
    public static void main(String[] args) {
        head = new Node(5);
        head.next = new Node(8);
        head.next.next = new Node(9);
        head.next.next.next = new Node(1);
        head.next.next.next.next = head;

        displayNode(head);
    }
}
