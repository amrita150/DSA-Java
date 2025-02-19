class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class DeleteNodeInLL {
    public static Node head;
    public static Node tail;

    // Delete a node from the beginning of the list
    public static void deleteAtBeg(){
        if(head==null){
            return;
        } 
        head = head.next;
        if (head == null) { // If the list becomes empty, update the tail
            tail = null;
        }
    }

    public static void deleteAtEnd(){
        if(head==null){
            return;
        } else if(head.next==null){
            head = null;
            tail = null;
        } else{
            Node temp = head;
            while(temp.next.next!=null){
            temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    public static void displayNode(Node head){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while(temp.next != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print(temp.data);
    }
    public static void main(String[] args) {
        head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(7);
        tail = head.next.next.next = new Node(6);

        deleteAtEnd();
        displayNode(head);
    }
}
