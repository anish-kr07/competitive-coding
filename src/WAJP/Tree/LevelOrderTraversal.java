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
        if(root == null)
            return levelOrderTraversal;
        queue.offer(root);
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
    public List<List<Integer>> levelOrderTraversalWithSeparateLevels(LevelOrderNode root) {
        List<List<Integer>> levelOrderTraversal = new ArrayList<>();
        Queue<LevelOrderNode> queue = new LinkedList<>();
        if(root == null)
            return levelOrderTraversal;
        queue.add(root);
        while (!queue.isEmpty()){
            List<Integer> leveSubList = new ArrayList<>();
            int levelSize = queue.size();
            for(int i = 0;i < levelSize;i++){
                LevelOrderNode temp = queue.poll();
                leveSubList.add(temp.val);

                if(temp.left != null)
                    queue.add(temp.left);
                if(temp.right != null)
                    queue.add(temp.right);

            }
            levelOrderTraversal.add(leveSubList);
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
        System.out.println("****LevelorderTraversalIterative****");
        System.out.println(levelOrderTraversalList);
        List<List<Integer>> levelOrderTraversalListWithLevels = tree.levelOrderTraversalWithSeparateLevels(tree.root);
        System.out.println("****LevelOrderTraversal With Separate Levels****");
        System.out.println(levelOrderTraversalListWithLevels);
    }

}
