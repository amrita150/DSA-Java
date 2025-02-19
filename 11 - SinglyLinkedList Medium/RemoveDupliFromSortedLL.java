class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class RemoveDupliFromSortedLL {
    public static Node head;
    public static Node deleteDuplicates(Node head) {
        if(head==null|| head.next==null){
            return head;
        }
        Node temp = head;
        while(temp.next!=null){
            if(temp.data == temp.next.data){
                temp.next = temp.next.next;
            }
            else{
                temp = temp.next;
            }
            
        }
        return head;
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

    public static void main(String args[]){
        head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(3);
        head.next.next.next = new Node(6);
        displayNode(head);
        System.out.println("\nAfter removing duplicate the LL is: ");
        Node res = deleteDuplicates(head);
        displayNode(head);
    }
}