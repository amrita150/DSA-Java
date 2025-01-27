class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class SearchInLinkedList{
    public static Node head;
    public static boolean Search(int data){
        if(head==null){
            return false;
        }
        Node temp = head;
        while(temp.next != null){
            if(temp.data == data){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public static void main(String[] args) {
        head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(7);
        head.next.next.next = new Node(6);
        System.out.println("Is the searched value present ?\n"+ Search(1));
    }
}
