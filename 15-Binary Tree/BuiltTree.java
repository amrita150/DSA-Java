//create tree using preOrder traversal
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

public class BuiltTree {
    static int idx = -1;
    public static Node createTree(int arr[]){
        idx++;
        if(arr[idx]==-1){
            return null;
        }
        Node newNode = new Node(arr[idx]);
        newNode.left = createTree(arr);
        newNode.right = createTree(arr);

        return newNode;
    }
    public static void main(String args[]){
        int arr[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = createTree(arr);
        System.out.println(root.data);
    }
}
