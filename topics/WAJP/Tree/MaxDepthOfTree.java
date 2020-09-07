package WAJP.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class MaxDepthTreeNode
{
    int val;
    MaxDepthTreeNode left, right;

    public MaxDepthTreeNode(int item)
    {
        val = item;
        left = right = null;
    }
}

class MaxDepthTree {
    // Root of Binary Tree
    MaxDepthTreeNode root;

    MaxDepthTree()
    {
        root = null;
    }

    public int maxDepth(MaxDepthTreeNode root) {
        if(root == null)
            return 0;
        else {
            int lDepth = maxDepth(root.left);
            int lRight = maxDepth(root.right);

            if(lDepth > lRight)
                return lDepth+1;
            else
                return lRight+1;
        }

    }

    public static void main(String[] args) {
        MaxDepthTree tree = new MaxDepthTree();
        tree.root = new MaxDepthTreeNode(1);
        tree.root.left = new MaxDepthTreeNode(2);
        tree.root.right = new MaxDepthTreeNode(3);
        tree.root.left.left = new MaxDepthTreeNode(4);
        tree.root.left.right = new MaxDepthTreeNode(5);
        tree.root.left.right.left = new MaxDepthTreeNode(8);
        tree.root.left.right.right = new MaxDepthTreeNode(9);
        tree.root.right.left = new MaxDepthTreeNode(6);
        tree.root.right.right = new MaxDepthTreeNode(7);
        int maxDepth = tree.maxDepth(tree.root);
        System.out.println("****MaxDepthOfTree****");
        System.out.println(maxDepth);
    }

}
