
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

public class lcaOptimizedSApproach {
    public static Node lca(Node root, int n1, int n2){
        if(root==null){
            return null;
        }

        if(root.data == n1 || root.data==n2){
            return root;
        }

        Node leftSide = lca(root.left, n1, n2);
        Node rightSide = lca(root.right, n1,n2);

        if(leftSide==null){
            return rightSide;
        }
        if(rightSide==null){
            return leftSide;
        }

        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.right = new Node(3);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

       Node res = lca(root, 4, 5);
       System.out.println(res.data);
    }
}
