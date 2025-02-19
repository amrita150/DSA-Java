class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MiddleOfLinkedList {
    public static Node head;

    // Brute Force Approach (Two-Pass)
    public static Node findMiddle(Node head) {
        int count = 0;
        Node temp = head;

        while (temp != null) { // Count the number of nodes
            count++;
            temp = temp.next;
        }

        temp = head;
        for (int i = 0; i < count / 2; i++) { // Move to the middle
            temp = temp.next;
        }

        return temp; // Middle node
    }

    // Optimized Two-Pointer Approach (Single Pass)
    public static Node middleOfLL(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow; // Middle node
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
        head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(7);
        head.next.next.next = new Node(6);
        head.next.next.next.next = new Node(9);

        System.out.println("Original List:");
        displayNode(head);

        Node middle = middleOfLL(head); // Optimized approach
        System.out.println("\nMiddle of LL:");
        displayNode(middle);
    }
}
