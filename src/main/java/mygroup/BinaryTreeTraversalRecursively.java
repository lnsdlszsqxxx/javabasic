package mygroup;

public class BinaryTreeTraversalRecursively {
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

    public static void inorder(TreeNode root) {
        if(root==null) return;
        inorder(root.getLeft());
        System.out.println(root.getRoot());
        inorder(root.getRight());
    }

    public static void preorder(TreeNode root) {
        if(root==null) return;
        System.out.println(root.getRoot());
        preorder(root.getLeft());
        preorder(root.getRight());
    }

    public static void postorder(TreeNode root) {
        if(root==null) return;
        postorder(root.getLeft());
        postorder(root.getRight());
        System.out.println(root.getRoot());
    }
}
