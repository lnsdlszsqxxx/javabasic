//https://leetcode.com/problems/maximum-binary-tree/description/
package mygroup;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumBinaryTree {

    public static void main(String[] args) {
        int[] input = {3,2,1,6,0,5};

        TreeNode root = construct(input,0,input.length-1);

        traversalBFS(root);
        traversalDFS(root);
    }

    public static TreeNode construct(int[] x, int l, int r){
        TreeNode root = new TreeNode();
        int iMax=max(x,l,r);
        root.setRoot(x[iMax]);
        if(iMax>l) root.setLeft(construct(x,l,iMax-1));
        if(iMax<r) root.setRight(construct(x,iMax+1,r));
        return root;
    }


    public static int max(int[] x, int l, int r){
        int maxIndex=l;
        for (int i=l;i<=r;i++){
            if(x[i]>x[maxIndex]) maxIndex=i;
        }
        return maxIndex;
    }

    public static void traversalBFS(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (queue.size()>0){
            root=queue.poll();
            System.out.println(root.getRoot());
            if (root.getLeft()!=null) queue.add(root.getLeft());
            if (root.getRight()!=null)queue.add(root.getRight());
        }
    }

    public static void traversalDFS(TreeNode root){
        if(root==null) return;
        traversalDFS(root.getLeft());
        System.out.println(root.getRoot());
        traversalDFS(root.getRight());

    }

}
