
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SegregateEvenOdd {
    public static Node head;

    public static Node oddEven(Node head) {
        Node startEven = null;
        Node endEven = null;
        Node endOdd = null;
        Node startOdd = null;
        Node curr = head;
        while(curr!=null){
            if(curr.data%2==0){
                if(startEven==null){
                    startEven = curr;
                    endEven = startEven;
                } else{
                    endEven.next = curr;
                    endEven = endEven.next;
                }
            } else{
                if(startOdd==null){
                    startOdd = curr;
                    endOdd = startOdd;
                } else{
                    endOdd.next = curr;
                    endOdd = endOdd.next;
                }
            }
         curr = curr.next;
        }
        if(startEven ==null|| startOdd==null){
            return head;
        }
        endOdd.next = startEven;
        endEven.next=null;
        return startOdd; 
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
        head.next.next.next = new Node(8);
        head.next.next.next.next = new Node(9);
        head.next.next.next.next.next = new Node(1);


        System.out.println("Linked List:");
        displayNode(head);

        Node res = oddEven(head);
        displayNode(res);
    }
}
