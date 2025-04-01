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

public class SumOfNodes {
    public static int sum(Node root){
        if(root==null){
            return 0;
        }
        int ls = sum(root.left);
        int rs = sum(root.right);
        int totalSum =  ls+rs+ root.data;
        return totalSum;
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
        System.out.println(sum(root));
    }
}

