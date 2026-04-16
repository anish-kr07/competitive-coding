package WAJP.Practice;

import java.util.*;

class TreeNode{
    int val;
    TreeNode left,right;
    TreeNode(int val){
        this.val = val;
        left = right = null;
    }
}
public class PreorderTreeTraversalPractice {
    //binary tree root
    TreeNode root;
    PreorderTreeTraversalPractice(){
        root=null;
    }

    //preorder
    static List<Integer> preorderTraversalRecursive(TreeNode rootNode){
        TreeNode root = rootNode;
        List<Integer> listRecursive = new ArrayList<>();
            if (root == null)
                return listRecursive;
            listRecursive.add(root.val);
            listRecursive.addAll(preorderTraversalRecursive(root.left));
            listRecursive.addAll(preorderTraversalRecursive(root.right));
            return listRecursive;

        }
    static List<Integer> preorderTraversalIterative(TreeNode rootNode){
        TreeNode root = rootNode;
        List<Integer> listIterative = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();

        while (true){
            while(root != null){
                listIterative.add(root.val);
                stack.push(root);
                root = root.left;
            }
            if(stack.isEmpty())
                break;
            root = stack.pop();
            root= root.right;
        }

        return listIterative;

    }

    //inorder
    static List<Integer> inorderTraversalRecursive(TreeNode rootNode){
        TreeNode root = rootNode;
        List<Integer> listRecursive = new ArrayList<>();
        if (root == null)
            return listRecursive;
        listRecursive.addAll(inorderTraversalRecursive(root.left));
        listRecursive.add(root.val);
        listRecursive.addAll(inorderTraversalRecursive(root.right));
        return listRecursive;

    }
    static List<Integer> inorderTraversalIterative(TreeNode rootNode){
        TreeNode root = rootNode;
        List<Integer> listIterative = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();

        while (true){
            while(root != null){
                stack.push(root);
                root = root.left;
            }
            if(stack.isEmpty())
                break;
            root = stack.pop();
            listIterative.add(root.val);
            root= root.right;
        }

        return listIterative;

    }

    //postorder
    static List<Integer> postorderTraversalRecursive(TreeNode rootNode){
        TreeNode root = rootNode;
        List<Integer> listRecursive = new ArrayList<>();
        if (root == null)
            return listRecursive;
        listRecursive.addAll(postorderTraversalRecursive(root.left));
        listRecursive.addAll(postorderTraversalRecursive(root.right));
        listRecursive.add(root.val);
        return listRecursive;

    }

    //tough
    static List<Integer> postorderTraversalIterative(TreeNode rootNode) {
        List<Integer> listIterative = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode curr = rootNode, prev = null;

        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.peek();
            // visit only if right subtree is null or already visited
            if (curr.right == null || curr.right == prev) {
                listIterative.add(curr.val);
                stack.pop();
                prev = curr;
                curr = null;
            } else {
                curr = curr.right;   // go right first
            }
        }
        return listIterative;
    }


    public static void main(String[] args) {
        PreorderTreeTraversalPractice tree = new PreorderTreeTraversalPractice();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        tree.root.left.right.left = new TreeNode(8);
        tree.root.left.right.right = new TreeNode(9);

        tree.root.right = new TreeNode(3);
        tree.root.right.left = new TreeNode(6);
        tree.root.right.right = new TreeNode(7);
        System.out.println("args = " + tree.toString());
        System.out.println("*********Pre order Traversal Recursive ************");
        System.out.println(preorderTraversalRecursive(tree.root));
        System.out.println("*********Pre order Traversal Iterative ************");
        System.out.println(preorderTraversalIterative(tree.root));

        System.out.println("*********In order Traversal Recursive ************");
        System.out.println(inorderTraversalRecursive(tree.root));
        System.out.println("*********In order Traversal Iterative ************");
        System.out.println(inorderTraversalIterative(tree.root));

        System.out.println("*********Post order Traversal Recursive ************");
        System.out.println(postorderTraversalRecursive(tree.root));
        System.out.println("*********Post order Traversal Iterative ************");
        System.out.println(postorderTraversalIterative(tree.root));


    }
}
