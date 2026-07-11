package Trees;

import Basics.Node;

public class DFS {
    public static void main(String[] args) {
        System.out.println();
        Node root = new Node("A");
        root.left = new Node("B");
        root.right = new Node("C");
        root.left.left = new Node("D");
        root.left.right = new Node("E");
        root.right.left = new Node("F");
        root.right.right = new Node("G"); 
        // preOrder(root);
        // postOrder(root);
        inOrder(root);
    }

    static void preOrder(Node node) {
        if (node == null)
            return;

        // visit the root node.
        System.out.print(node.data);
        // visit the left node.
        preOrder(node.left);
        // visit the right node.
        preOrder(node.right);
    }
    
    static void postOrder(Node node) {
        if (node == null)
            return;
        // visit the left node.
        postOrder(node.left);
        // visit the right node.
        postOrder(node.right);
        // visit the root node.
        System.out.print(node.data);
    }

    static void inOrder(Node node) {
        if(node == null)
            return;

        // visit the left node.
        inOrder(node.left);
        
        // visit the root node.
        System.out.print(node.data);

        // visit the right node.
        inOrder(node.right);
    }
}
