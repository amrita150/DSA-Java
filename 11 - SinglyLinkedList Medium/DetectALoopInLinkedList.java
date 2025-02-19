class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DetectALoopInLinkedList {
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
