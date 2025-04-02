import java.util.*;
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
    int hd; 
    Node node;

    Info(int hd, Node node){
        this.hd = hd;
        this.node = node;
    }
}

public class TopViewOfBT {
    public static int min;
    public static int max;
    public static void topView(Node root){
        HashMap<Integer, Node> hm = new HashMap<>();
        Queue<Info> q = new LinkedList<>();
        q.add( new Info(0, root));
        q.add(null);

        while(!q.isEmpty()){
            Info currNode = q.remove();
            if(currNode==null){
                if(q.isEmpty()){
                    break;
                } else{
                    q.add(null);
                }
            } else{
                if(!hm.containsKey(currNode.hd)){
                    hm.put(currNode.hd, currNode.node);
                } 
                if(currNode.node.left!=null){
                    q.add(new Info(currNode.hd -1,currNode.node.left));
                    min = Math.min(min,currNode.hd -1);
                }
                if(currNode.node.right!=null){
                    q.add(new Info(currNode.hd+1,currNode.node.right));
                    max = Math.max(max,currNode.hd + 1);
                }
            }
        }

        for(int i=min; i<=max; i++){
            System.out.print(hm.get(i).data + " ");
        }
    }

    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.right= new Node(4);
        root.right = new Node(3);
        root.left.right.right = new Node(5);
        root.left.right.right.right = new Node(6);
        topView(root);
    }
}
