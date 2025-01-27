class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LengthOfLL {
    public static Node head;
    public static int Lenght(Node head){
        if(head==null){
            return 0;
        }
        int count = 1;
        Node temp = head;
        while(temp.next != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String[] args) {
        head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(7);
        head.next.next.next = new Node(6);
        System.out.println("Total count is: "+ Lenght(head));
    }
}
