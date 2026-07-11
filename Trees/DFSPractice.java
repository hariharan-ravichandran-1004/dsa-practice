package Trees;
import java.util.ArrayList;
import java.util.List;
import Basics.Node;

public class DFSPractice {
    public static void main(String[] args) {
        Node root = new Node("null");
        root.left = new Node("1");
        root.right = new Node("2");
        root.right.right = new Node("3");
        inorderTraversal(root);
    }

    public static List<Integer> inorderTraversal(Node root) {
        ArrayList preorderResult = new ArrayList();
        if (root == null)
            return new ArrayList<>();

        inorderTraversal(root.left);
        if (root.data != "null") {
            preorderResult.add(root.data);
        }
        inorderTraversal(root.right);
        
        return new ArrayList<>();
    }

}