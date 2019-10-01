package mygroup;

import java.util.Stack;

public class BinaryTreeTraversalIteratively {
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

//        inorder(root);
//        preorder(root);
        postorder(root);
    }

    public static void inorder(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();

        while (stack.size()>0||root!=null){
            if (root!= null) {
                stack.push(root);
                root = root.getLeft();
            }
            else {
                root=stack.pop();
//                root.setLeft(null);
                System.out.println(root.getRoot());
//                if(root.getRight()!=null)
                    root = root.getRight();
//                else root=null;
            }
        }
    }

    public static void preorder(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();

        stack.push(root);
        while (stack.size() > 0) {
            root = stack.pop();
            System.out.println(root.getRoot());

            if(root.getRight()!=null) stack.push(root.getRight());
            if(root.getLeft()!=null) stack.push(root.getLeft());
        }
    }

    public static void postorder(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode top = new TreeNode();

        stack.push(root);
        while (stack.size() > 0) {
            top = stack.peek();

            if(!(top.getLeft()==null&&top.getRight()==null)) {
                if (top.getRight() != null) {stack.push(top.getRight()); top.setRight(null);}
                if (top.getLeft() != null) {stack.push(top.getLeft()); top.setLeft(null);}
            }
            else {
                top = stack.pop();
                System.out.println(top.getRoot());
            }

        }
    }
}
