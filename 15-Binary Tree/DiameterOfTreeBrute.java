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

public class DiameterOfTreeBrute {

    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return (Math.max(lh,rh) + 1);
    }

    public static int diameter(Node root){
        if(root==null){
            return 0;
        } 

        int ld = diameter(root.left);
        int lh = height(root.left);
        int rd = diameter(root.right);
        int rh = height(root.right);

        int selfDia = lh + rh + 1;
        return Math.max(Math.max(ld, rd) ,  selfDia);
    } 
    
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.left.left = new Node(6);
        root.left.right = new Node(5);
        root.left.right.right = new Node(7);
        root.left.right.right.right = new Node(8);
        System.out.println(diameter(root));
    }
}

