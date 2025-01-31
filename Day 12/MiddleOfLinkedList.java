class Node{
    int data;
    Node next;
    Node prev;

    public Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class MiddleOfLinkedList {
    public static Node head;

    //brute force approach
    public static Node findMiddle(Node head) {
        int count = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            count++;
        }
        int loc = (count/2);
        temp = head;
        for(int i=0; i<loc;i++){
            temp = temp.next;
        }
        head = temp;
        return head;
    } // time complexity is O(n), but the problem is we solved this in double pass not in a single pass

    //optimized approach
    //in thi swe use two pointer approach, by using fast and slow pointer
    public static Node middleOfLL(Node head){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }//time complexity = O(n), in single pass

    public static void displayNode(Node head){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while(temp.next != null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.print(temp.data);
    }

    public static void main(String[] args) {
        head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(7);
        head.next.next.next = new Node(6);
        head.next.next.next.next = new Node(9);
        System.out.println("Original List is: ");
        displayNode(head);
        Node middle = middleOfLL(head);
        System.err.println("\nMiddle of LL is: ");
        displayNode(middle);
    }
}




