package mygroup;

import apple.laf.JRSUIUtils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindLargestValueinEachTreeRow515 {
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

        System.out.println(largestValues(root));
    }

    public static List<Integer> largestValues(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (queue.size() > 0) {
            int currentSize = queue.size();
            int max=Integer.MIN_VALUE;

            for(int i=0;i<currentSize;i++){
                TreeNode tempNode = queue.poll();
                if(tempNode.getLeft()!=null) queue.add(tempNode.getLeft());
                if(tempNode.getRight()!=null) queue.add(tempNode.getRight());
                max=Math.max(max,tempNode.getRoot());
            }

            result.add(max);
        }

        return result;

    }
}
