package mygroup;

import java.util.LinkedList;
import java.util.Queue;

public class TreeTraversalBFS {

    public static void main(String[] args) {

        TreeNode t1 = new TreeNode();
        TreeNode t2 = new TreeNode();
        TreeNode t3 = new TreeNode();
        TreeNode t4 = new TreeNode();
        TreeNode t5 = new TreeNode();
        TreeNode t6 = new TreeNode();
        TreeNode t7 = new TreeNode();
        TreeNode t8 = new TreeNode();
        TreeNode t9 = new TreeNode();
        TreeNode t10 = new TreeNode();
        TreeNode t11 = new TreeNode();

        t1.setRoot(1);
        t1.setLeft(t2);
        t1.setRight(t3);

        t2.setRoot(2);
        t2.setLeft(t4);
        t2.setRight(t5);

        t4.setRoot(4);
        t5.setRoot(5);

        t3.setRoot(3);
        t3.setLeft(t6);
        t3.setRight(t7);

        t6.setRoot(6);
        t6.setLeft(t8);
        t6.setRight(t9);

        t7.setRoot(7);

        t8.setRoot(8);

        t9.setRoot(9);
        t9.setLeft(t10);
        t9.setRight(t11);

        t10.setRoot(10);

        t11.setRoot(11);


        traversalBSF(t1);

    }

    public static void traversalBSF(TreeNode root){
        int sum=0;
        int levelCount=0;

        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        queue.add(root);

        while  (queue.size()>0) {
            levelCount = queue.size();
            sum = 0;

            while (levelCount > 0) {
                root = queue.poll();
                sum += root.getRoot();
                if(root.getLeft()!=null)  queue.add(root.getLeft());
                if(root.getRight()!=null) queue.add(root.getRight());
                levelCount--;
            }
            System.out.println(sum);
        }


    }

}
