package mygroup;

import apple.laf.JRSUIUtils;
import sun.security.krb5.internal.rcache.DflCache;

public class MaximumBinaryTree654 {
    public static void main(String[] args) {

        int[] input = {3,2,1,6,0,5};
        TreeNode root = constructMaximumBinaryTree(input);
        traversalInOrder(root);
    }

    public static TreeNode constructMaximumBinaryTree(int[] nums) {
        int n=nums.length;
        TreeNode root = DFS(nums,0,n-1);
        return root;
    }

    public static TreeNode DFS(int[] nums, int start, int end){
        TreeNode root = new TreeNode();

        if(start==end) {
            root.setRoot(nums[start]);
            return root;
        }

        int indexOfMax = findMax(nums,start,end);
        root.root=nums[indexOfMax];
        if(start<indexOfMax) root.left=DFS(nums,start,indexOfMax-1);
        if(end>indexOfMax) root.right=DFS(nums,indexOfMax+1,end);

        return root;
    }

    public static int findMax(int[] nums, int start, int end){
        int maxIndex=start;
        for(int i=start+1;i<=end;i++){
            if(nums[i]>nums[maxIndex]) maxIndex=i;
        }
        return maxIndex;
    }

    public static void traversalInOrder(TreeNode root){
        if(root==null) return;

        System.out.println(root.root);
        traversalInOrder(root.left);
        traversalInOrder(root.right);
    }

}
