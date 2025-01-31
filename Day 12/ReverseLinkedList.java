class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseLinkedList {
    public static Node head;

    //iterative
    public static Node reverseList(Node head) {
         if(head == null || head.next == null){
             return head;
         }
 
         Node curr = head;
         Node prev = null;
         Node next;
 
         while(curr!=null){
             next = curr.next;
             curr.next = prev;
             prev = curr;
             curr = next;
         }
 
         return prev;
 
     }


     //recursive approach
     //later

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
        head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(7);
        head.next.next.next = new Node(6);
        head.next.next.next.next = new Node(9);

        System.out.println("Original List:");
        displayNode(head);

        Node newList = reverseList(head); // Optimized approach
        System.out.println("\nReverse List:");
        displayNode(newList);
    }
}
