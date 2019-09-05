package mygroup;

import java.util.Arrays;
import java.util.Collections;

public class MaximumBinaryTree {

    public static void main(String[] args) {
        int[] input = {3,2,1,6,0,5};
        System.out.println(max(input));
        TreeNode tValue = new TreeNode();
        TreeNode tIndex = new TreeNode();
        tValue.setRoot(input[max(input)]);
        tIndex.setRoot(max(input));
    }

    public static void traversal(){

    }

    public static int max(int[] x){
        int maxIndex=0;
        for (int i=1;i<x.length;i++){
            if(x[i]>x[maxIndex]) maxIndex=i;
        }
        return maxIndex;
    }
}
