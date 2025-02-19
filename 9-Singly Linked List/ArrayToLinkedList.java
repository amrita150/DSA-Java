class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    } // constructor to create a new node
}

class ArrayToLinkedList {
    public static Node constructLL(int arr[]) {
        int size = arr.length;
        if(size==0){
            return null;
        }
        Node head = new Node(arr[0]);
        Node temp = head;
        for(int i =1; i<size; i++){
            Node newNode = new Node(arr[i]);
            temp.next = newNode;
            temp = temp.next;
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

    public static void main(String[] args) {
        int arr[] = {3,2,1,0};
        Node head = constructLL(arr);
        displayNode(head);
    }
}
