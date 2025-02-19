class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class StartingPointOfLoopLL {
    public static Node head;

    public static Node startingPt(Node head){
        Node slow = head;
        Node fast = head;
        //detect a loop
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            //if loop find then stop the searching
            if(slow==fast){
                break;
            }
        }
        //check if there present any loop or not
        if(fast==null || fast.next==null){
            return null;
        }
        fast = head;
        while(fast!=slow){
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }

    public static void main(String[] args) {
        head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(7);
        head.next.next.next = new Node(6);
        head.next.next.next.next = new Node(9);
        head.next.next.next.next.next = head.next.next.next;

        Node res = startingPt(head);
        if(res!=null){
            System.out.println("Yes it has a cycle and starting pt. of loop is: "+ res.data);
        } else{
            System.out.println("No it does not have a cycle");
        }
    }
}
