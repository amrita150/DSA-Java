import java.util.*;

class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
    }
}

public class ZigZagTraversal {

    public static List<List<Integer>> zigzagLevelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0; 

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> levelNodes = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                Node current = queue.poll();
                levelNodes.add(current.val);

                if (current.left != null) queue.offer(current.left);
                if (current.right != null) queue.offer(current.right);
            }

            if (level % 2 == 1) {
                Collections.reverse(levelNodes);
            }

            result.add(levelNodes);
            level++; 
        }

        return result;
    }


    public static void printZigzag(List<List<Integer>> result) {
        for (List<Integer> level : result) {
            for (int val : level) {
                System.out.print(val + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
  
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        List<List<Integer>> zigzagResult = zigzagLevelOrder(root);
        printZigzag(zigzagResult);
    }
}
