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

class Info {
    int height; 
    int diameter;

    Info(int ht, int dia){
        this.diameter = dia;
        this.height = ht;
    }
}

public class DiameterOfTreeOptimized {

    public static Info diameter(Node root){
        if(root==null){
            return new Info(0,0);
        } 

        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);
        int finalHeight = Math.max(leftInfo.height, rightInfo.height)  + 1;
        int finalDia = Math.max(Math.max(leftInfo.diameter, rightInfo.diameter),leftInfo.height+rightInfo.height+1);
        return new Info(finalHeight, finalDia);
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
        Info maxDia = diameter(root);
        System.out.println(maxDia.diameter);
    }
}

