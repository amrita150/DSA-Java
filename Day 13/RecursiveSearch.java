import java.util.*;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class RecursiveSearch {
    public static Node head;

    // Recursive search function
    public static boolean search(Node head, int target) {
        if (head == null) {
            return false;
        }
        if (head.data == target) {
            return true;
        }
        return search(head.next, target);
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

        // Taking user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element you want to search: ");
        int target = sc.nextInt();
        sc.close();  // Closing the Scanner

        // Printing result
        if (search(head, target)) {
            System.out.println(target + " is present in the linked list.");
        } else {
            System.out.println(target + " is not found in the linked list.");
        }
    }
}
