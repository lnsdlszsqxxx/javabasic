package mygroup;
//https://leetcode.com/problems/binary-tree-inorder-traversal/
import java.util.*;

public class BinaryTreeInorderTraversal94 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode();
        TreeNode r1 = new TreeNode();
        TreeNode r2 = new TreeNode();
        TreeNode r3 = new TreeNode();
        TreeNode r4 = new TreeNode();
        TreeNode r5 = new TreeNode();

        root.setRoot(3);
        root.setLeft(r1);
        root.setRight(r2);

        r1.setRoot(9);

        r2.setRoot(20);
        r2.setLeft(r3);
        r2.setRight(r4);

        r3.setRoot(15);

        r4.setRoot(7);
        r4.setRight(r5);

        r5.setRoot(100);

        List<Integer> list = postorderTraversal2(root);
        System.out.println(list);
    }

    public static List<Integer> postorderTraversal2(TreeNode root){
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode top = new TreeNode();

        stack.push(root);

        while (stack.size() > 0) {
            top = stack.peek();

            if(!(top.getRight()==null&&top.getLeft()==null)) {
                if (top.getRight() != null) {
                    stack.push(top.getRight());
                    top.setRight(null);
                }
                if (top.getLeft() != null) {
                    stack.push(top.getLeft());
                    top.setLeft(null);
                }
            }
            else {
                top = stack.pop();
                list.add(top.getRoot());
            }

        }
        return list;
    }


    public static List<Integer> postorderTraversal(TreeNode root){
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();

        stack.push(root);

        while (stack.size() > 0) {
            root = stack.pop();
            stack2.push(root);

        if(root.getLeft()!=null) stack.push(root.getLeft());
        if(root.getRight()!=null) stack.push(root.getRight());
        }

        while (stack2.size() > 0) {
            list.add(stack2.pop().getRoot());
        }

        return list;
    }


    public static List<Integer> preorderTraversal(TreeNode root){
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()){
            root = stack.pop();
            list.add(root.getRoot());
            if(root.getRight()!=null) stack.push(root.getRight());
            if(root.getLeft()!=null) stack.push(root.getLeft());
        }
        return list;
    }


    public static List<Integer> inorderTraversal2(TreeNode root){
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        while(root!=null||!stack.isEmpty()){

            if(root!=null){
                stack.add(root);
                root=root.getLeft();
            }
            else {
                root=stack.pop();
                list.add(root.getRoot());
                root=root.getRight();
            }
        }
        return list;
    }


    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        traversal(root,list);
        return list;
    }

    public static void traversal(TreeNode node, List<Integer> list){
        if (node==null) return;
        traversal(node.getLeft(),list);
        list.add(node.getRoot());
        traversal(node.getRight(),list);
    }

}
