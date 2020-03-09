package WAJP.Tree;

import java.util.ArrayList;
import java.util.List;

class Node
{
    int val;
    Node left, right;

    public Node(int item)
    {
        val = item;
        left = right = null;
    }
}

public class TreePreOrdertraversal {
    // Root of Binary Tree
    Node root;

    TreePreOrdertraversal()
    {
        root = null;
    }

    public List<Integer> preorderTraversalRecursive(Node root) {
        List<Integer> preOrderTraversal = new ArrayList<>();
        if(root == null)
            return preOrderTraversal;
        preOrderTraversal.add(root.val);
        preOrderTraversal.addAll(preorderTraversalRecursive(root.left));
        preOrderTraversal.addAll(preorderTraversalRecursive(root.right));
        return preOrderTraversal;

    }

    public static void main(String[] args) {
        TreePreOrdertraversal tree = new TreePreOrdertraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        List<Integer> preOrderTraversalList = tree.preorderTraversalRecursive(tree.root);
        System.out.println("****PreOrderTraversal****");
        System.out.println(preOrderTraversalList);
    }

}
