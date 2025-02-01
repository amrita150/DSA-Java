class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LengthOfLoopInLL {
    public static Node head;
    public static int countNodesinLoop(Node head) {
        Node slow = head, fast = head;
        
        // Detect Loop using Floyd’s Cycle Detection Algorithm
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return countLoopNodes(slow);
            }
        }
        
        // No loop detected
        return 0;
    }
    
    //count the number of nodes in the loop
    public static int countLoopNodes(Node loopNode) {
        int count = 1;
        Node temp = loopNode;
        
        while (temp.next != loopNode) {
            temp = temp.next;
            count++;
        }
        
        return count;
    }
    

    public static void main(String[] args) {
        head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(7);
        head.next.next.next = new Node(6);
        head.next.next.next.next = new Node(9);
        head.next.next.next.next.next = head.next.next;

        int res = countNodesinLoop(head);
        System.out.println("the length of loop: "+ res);
    }
}
