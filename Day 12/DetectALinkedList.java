class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DetectALinkedList {
    public static Node head;

    public static boolean hasCycle(Node head) {
        Node slow = head, fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
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
        head.next.next.next.next.next = head.next.next.next;

        if(hasCycle(head)){
            System.out.println("Yes it has a cycle");
        } else{
            System.out.println("No it does not have a cycle");
        }
    }
}
