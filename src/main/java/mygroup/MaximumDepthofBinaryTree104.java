package mygroup;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthofBinaryTree104 {
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

        System.out.println(maxDepth(root));
    }

    public static int maxDepth(TreeNode root) {
        int depth=1;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        int size=0;

        queue.add(root);

        while (queue.size()>0){
            size = queue.size();

            for(int i=0;i<size;i++) {
                root = queue.poll();
                if (root.getLeft() != null) queue.add(root.getLeft());
                if (root.getRight() != null) queue.add(root.getRight());
            }
            if(queue.size()!=0) depth++;
        }

        return depth;
    }
}
