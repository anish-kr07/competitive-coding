package WAJP.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode
{
    int val;
    TreeNode left, right;

    public TreeNode(int item)
    {
        val = item;
        left = right = null;
    }
}

public class InOrderTraversal {
    // Root of Binary Tree
    TreeNode root;

    InOrderTraversal()
    {
        root = null;
    }

    public List<Integer> inOrderTraversalRecursive(TreeNode root) {
        List<Integer> inOrderTraversal = new ArrayList<>();
        if(root == null)
            return inOrderTraversal;
        inOrderTraversal.addAll(inOrderTraversalRecursive(root.left));
        inOrderTraversal.add(root.val);
        inOrderTraversal.addAll(inOrderTraversalRecursive(root.right));
        return inOrderTraversal;

    }

    public List<Integer> inOrderTraversalIterative(TreeNode root) {
        List<Integer> inOrderTraversal = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (true){
            while (root != null){
                stack.push(root);
                root = root.left;
            }
            if(stack.empty())
                break;
            root = stack.pop();
            inOrderTraversal.add(root.val);
            root = root.right;
        }
        return inOrderTraversal;

    }

    public static void main(String[] args) {
        InOrderTraversal tree = new InOrderTraversal();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        tree.root.left.right.left = new TreeNode(8);
        tree.root.left.right.right = new TreeNode(9);
        tree.root.right.left = new TreeNode(6);
        tree.root.right.right = new TreeNode(7);
        List<Integer> inOrderTraversalList = tree.inOrderTraversalRecursive(tree.root);
        System.out.println("****InOrderTraversalRecursive****");
        System.out.println(inOrderTraversalList);
        inOrderTraversalList = tree.inOrderTraversalIterative(tree.root);
        System.out.println("****InOrderTraversalIterative****");
        System.out.println(inOrderTraversalList);
    }

}
