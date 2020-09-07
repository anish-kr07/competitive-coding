package WAJP.Tree;

import java.util.LinkedList;
import java.util.Queue;

class SymmetricTreeNode
{
    int val;
    SymmetricTreeNode left, right;

    public SymmetricTreeNode(int item)
    {
        val = item;
        left = right = null;
    }
}

class SymmetricTree {
    // Root of Binary Tree
    SymmetricTreeNode root;

    SymmetricTree()
    {
        root = null;
    }

    public boolean isSymmetricRecursive(SymmetricTreeNode root) {
        return isMirror(root,root);
    }
    public boolean isMirror(SymmetricTreeNode root1,SymmetricTreeNode root2){
        if(root1 == null && root2 == null)
            return true;
        if(root1 == null || root2 == null)
            return false;
        else
            return (root1.val == root2.val)
                    && (isMirror(root1.left,root2.right))
                    && (isMirror(root1.right,root2.left));

    }
    public boolean isSymmetricIterative(SymmetricTreeNode root) {
        return  true;
//        boolean result = false;
//        if(root == null)
//            return true;
//        else{
//            Queue<SymmetricTreeNode> leftQueue = new LinkedList<>();
//            Queue<SymmetricTreeNode> rightQueue = new LinkedList<>();
//            leftQueue.add(root);
//            rightQueue.add(root);
//            while(!leftQueue.isEmpty() && !rightQueue.isEmpty()){
//                SymmetricTreeNode temp = leftQueue.poll();
//                if(temp.left != null)
//                    leftQueue.add(temp.left);
//                if(temp.right != null)
//                    leftQueue.add(temp.right);
//
//                temp = rightQueue.poll();
//                if(temp.left != null)
//                    rightQueue.add(temp.left);
//                if(temp.right != null)
//                    rightQueue.add(temp.right);
//                if(leftQueue.equals(rightQueue))
//                    result = true;
//                else
//                    result = false;
//            }
//        }
//        return result;
    }

    public static void main(String[] args) {
        SymmetricTree tree = new SymmetricTree();
        tree.root = new SymmetricTreeNode(1);
        tree.root.left = new SymmetricTreeNode(2);
        tree.root.right = new SymmetricTreeNode(3);
        tree.root.left.left = new SymmetricTreeNode(4);
        tree.root.left.right = new SymmetricTreeNode(5);
        tree.root.left.right.left = new SymmetricTreeNode(8);
        tree.root.left.right.right = new SymmetricTreeNode(9);
        tree.root.right.left = new SymmetricTreeNode(6);
        tree.root.right.right = new SymmetricTreeNode(7);
        boolean maxDepth = tree.isSymmetricRecursive(tree.root);
        System.out.println("****Symmetric Tree 1(Recursive)****");
        System.out.println(maxDepth);
        SymmetricTree tree1 = new SymmetricTree();
        tree1.root = new SymmetricTreeNode(1);
        tree1.root.left = new SymmetricTreeNode(2);
        tree1.root.right = new SymmetricTreeNode(2);
        tree1.root.left.left = new SymmetricTreeNode(4);
        tree1.root.left.right = new SymmetricTreeNode(5);
        tree1.root.right.left = new SymmetricTreeNode(5);
        tree1.root.right.right = new SymmetricTreeNode(4);
        maxDepth = tree1.isSymmetricRecursive(tree1.root);
        System.out.println("****Symmetric Tree 2(Recursive)****");
        System.out.println(maxDepth);

        maxDepth = tree.isSymmetricIterative(tree.root);
        System.out.println("****Symmetric Tree 1(Iterative)****");
        System.out.println(maxDepth);
        maxDepth = tree1.isSymmetricIterative(tree1.root);
        System.out.println("****Symmetric Tree 2(Iterative)****");
        System.out.println(maxDepth);
    }

}
