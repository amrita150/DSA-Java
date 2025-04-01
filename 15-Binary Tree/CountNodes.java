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

public class CountNodes {
    public static int count(Node root){
        if(root==null){
            return 0;
        }
        int lh = count(root.left);
        int rh = count(root.right);
        int totalHeight =  lh+rh+1;
        return totalHeight;
    }
    
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.right = new Node(3);
        root.right.right = new Node(7);
        root.right.right.right = new Node(9);
        root.right.right.right.right = new Node(8);
        root.left.right = new Node(5);
        System.out.println(count(root));
    }
}

