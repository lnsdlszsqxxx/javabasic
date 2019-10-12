package mygroup;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView199 {
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
        r1.setLeft(r3);
        r1.setRight(r4);

        r2.setRoot(20);

        r3.setRoot(15);
        r3.setRight(r5);

        r4.setRoot(7);

        r5.setRoot(100);

        List<Integer> result = rightSideView(root);
        System.out.println(result);
    }
    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> output = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList();
        int size=0;
        queue.add(root);
        while (queue.size()!=0){
            size=queue.size();
            for (int i=0;i<size;i++){
                TreeNode temp = queue.poll();
                if(temp.getLeft()!=null) queue.add(temp.getLeft());
                if(temp.getRight()!=null) queue.add(temp.getRight());
                if(i==size-1) output.add(temp.getRoot());
            }
        }
        return output;
    }

}
