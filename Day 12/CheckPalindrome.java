class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CheckPalindrome {
    public static Node head;
    public static boolean isPalindrome(Node head) {
        if(head.next==null || head==null){
            return true;
        }
        //find middle
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }

        Node mid = reverseList(slow);
        fast = head;
        while(mid!=null){
            if(mid.data!=fast.data){
                return false;
            }
            mid = mid.next;
            fast=fast.next;
        }
        return true;
    }

    public static Node reverseList(Node mid){
        Node curr = mid, prev = null, next = null;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(7);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(1);

        Boolean res = isPalindrome(head);
        if(res){
            System.out.println("Yes LL is palindrome");
        } else{
            System.out.println("No LL is not palin");
        }
    }
}
