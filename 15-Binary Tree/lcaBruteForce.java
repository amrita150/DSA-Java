import java.util.ArrayList;

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

public class lcaBruteForce {
    public static int lca(Node root, int n1, int n2){
        ArrayList<Integer> path1 = new ArrayList<>();
        ArrayList<Integer> path2 = new ArrayList<>();

        pathFind(path1, root, n1);
        pathFind(path2, root, n2);

        //to find lca
        int i = 0;
        for(; i<path1.size() && i<path2.size(); i++){
            if(path1.get(i)!=path2.get(i)){
                break;
            }
        }

        return path1.get(i-1);
    }

    public static boolean pathFind(ArrayList<Integer> arr, Node root, int n1){
        if(root==null){
            return false;
        }

        arr.add(root.data);
        if(root.data == n1){
            return true;
        }

        boolean leftSide = pathFind(arr, root.left, n1);
        boolean rightSide = pathFind(arr, root.right, n1);

        if(leftSide || rightSide){
            return true;
        }

        arr.remove(arr.size() - 1);

        return false;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.right = new Node(3);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

       System.out.println(lca(root, 4, 5));
    }
}
