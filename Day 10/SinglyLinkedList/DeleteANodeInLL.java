/*There is a singly-linked list head and we want to delete a node node in it.
You are given the node to be deleted node. You will not be given access to the first node of head.
All the values of the linked list are unique, and it is guaranteed that the given node node is not the last node in the linked list.
Delete the given node. */
class Node{
    int data;
    Node next;

     public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class DeleteANodeInLL {
    public static void deleteNode(Node node) {
        node.data = node.next.data;
        node.next = node.next.next;
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
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(7);
        head.next.next.next = new Node(6);
        deleteNode(head.next.next);
        displayNode(head);
    }
}
