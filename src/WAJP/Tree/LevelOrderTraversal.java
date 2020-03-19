package WAJP.Tree;

import java.util.*;

class LevelOrderNode
{
    int val;
    LevelOrderNode left, right;

    public LevelOrderNode(int item)
    {
        val = item;
        left = right = null;
    }
}

class LevelOrderTraversal {
    // Root of Binary Tree
    LevelOrderNode root;

    LevelOrderTraversal()
    {
        root = null;
    }

    public List<Integer> levelOrderTraversalIterative(LevelOrderNode root) {
        List<Integer> levelOrderTraversal = new ArrayList<>();
        Queue<LevelOrderNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            LevelOrderNode temp = queue.poll();
            levelOrderTraversal.add(temp.val);
            if(temp.left != null)
                queue.add(temp.left);
            if(temp.right != null)
                queue.add(temp.right);

        }
        return levelOrderTraversal;

    }

    public static void main(String[] args) {
        LevelOrderTraversal tree = new LevelOrderTraversal();
        tree.root = new LevelOrderNode(1);
        tree.root.left = new LevelOrderNode(2);
        tree.root.right = new LevelOrderNode(3);
        tree.root.left.left = new LevelOrderNode(4);
        tree.root.left.right = new LevelOrderNode(5);
        tree.root.left.right.left = new LevelOrderNode(8);
        tree.root.left.right.right = new LevelOrderNode(9);
        tree.root.right.left = new LevelOrderNode(6);
        tree.root.right.right = new LevelOrderNode(7);
        List<Integer> levelOrderTraversalList = tree.levelOrderTraversalIterative(tree.root);
        System.out.println("****PreOrderTraversalIterative****");
        System.out.println(levelOrderTraversalList);
    }

}
