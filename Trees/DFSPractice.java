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
        System.out.println(inorderTraversal(root));
    }

    public static List<String> inorderTraversal(Node root) {
        List<String> inorderResult = new ArrayList<>();
        if (root == null)
            return inorderResult;

        // visit the left subtree.
        inorderResult.addAll(inorderTraversal(root.left));

        // visit the root node.
        if (!"null".equals(root.data)) {
            inorderResult.add(root.data);
        }

        // visit the right subtree.
        inorderResult.addAll(inorderTraversal(root.right));

        return inorderResult;
    }

}