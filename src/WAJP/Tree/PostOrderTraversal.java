package WAJP.Tree;

import java.util.ArrayList;
import java.util.List;

class PostOrderTreeNode
{
    int val;
    PostOrderTreeNode left, right;

    PostOrderTreeNode(int item)
    {
        val = item;
        left = right = null;
    }
}

public class PostOrderTraversal {
    // Root of Binary Tree
    PostOrderTreeNode root;

    PostOrderTraversal()
    {
        root = null;
    }

    public List<Integer> postOrderTraversalRecursive(PostOrderTreeNode root) {
        List<Integer> postOrderTraversal = new ArrayList<>();
        if(root == null)
            return postOrderTraversal;
        postOrderTraversal.addAll(postOrderTraversalRecursive(root.left));
        postOrderTraversal.addAll(postOrderTraversalRecursive(root.right));
        postOrderTraversal.add(root.val);
        return postOrderTraversal;

    }
    public List<Integer> postOrderTraversalIterative(PostOrderTreeNode root) {
        List<Integer> postOrderTraversal = new ArrayList<>();
        if(root == null)
            return postOrderTraversal;
        postOrderTraversal.addAll(postOrderTraversalRecursive(root.left));
        postOrderTraversal.addAll(postOrderTraversalRecursive(root.right));
        postOrderTraversal.add(root.val);
        return postOrderTraversal;

    }

    public static void main(String[] args) {
        PostOrderTraversal tree = new PostOrderTraversal();
        tree.root = new PostOrderTreeNode(1);
        tree.root.left = new PostOrderTreeNode(2);
        tree.root.right = new PostOrderTreeNode(3);
        tree.root.left.left = new PostOrderTreeNode(4);
        tree.root.left.right = new PostOrderTreeNode(5);
        tree.root.right.left = new PostOrderTreeNode(6);
        tree.root.right.right = new PostOrderTreeNode(7);
        List<Integer> postOrderTraversalList = tree.postOrderTraversalRecursive(tree.root);
        System.out.println("****PostOrderTraversalRecursive****");
        System.out.println(postOrderTraversalList);
        postOrderTraversalList = tree.postOrderTraversalIterative(tree.root);
        System.out.println("****PostOrderTraversalIterative****");
        System.out.println(postOrderTraversalList);
    }

}

