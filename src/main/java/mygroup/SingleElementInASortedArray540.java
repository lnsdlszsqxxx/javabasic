//https://leetcode.com/problems/single-element-in-a-sorted-array/description/
package mygroup;

public class SingleElementInASortedArray540 {
    public static void main(String[] args) {

        int[] input = {1,1,2,3,3,4,4,8,8};
        int[] input2 = {3,3,7,7,10,11,11};
        System.out.println(findElement(input));
        System.out.println(findElement(input2));
    }

    public static int findElement(int[] x){

        for (int i=0;i<x.length-1;i+=2){
            if(x[i]!=x[i+1]) return x[i];
        }

        return -999;
    }
}
