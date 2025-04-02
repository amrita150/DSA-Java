class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class kthLevelOfTree {
    public static void kthLevel(Node root, int level, int key){
        //base case
        if(root==null){
            return;
        }

        if(key==level){
            System.out.print(root.data + " ");
            return;
        }

        kthLevel(root.left, level+1, key);
        kthLevel(root.right, level+1, key);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.right = new Node(3);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        kthLevel(root, 1, 3);
    }
}
