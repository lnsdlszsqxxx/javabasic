package mygroup;

import java.util.Arrays;

public class MergeSortedArray88 {
    public static void main(String[] args) {

        int[] input1={1,2,3,0,0,0};
        int[] input2={2,5,6};
        merge(input1,3,input2,3);
        System.out.println(Arrays.toString(input1));

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] temp = new int[m+n];
        int i=0;
        int j=0;

        while (i<m || j<n) {

            if(j>=n) {temp[i+j]=nums1[i++]; continue;}
            if(i>=m) {temp[i+j]=nums2[j++]; continue;}

            if(nums1[i]<nums2[j]) temp[i+j]=nums1[i++];
            else temp[i+j]=nums2[j++];
        }

        System.out.println(Arrays.toString(temp));

        for(int k=0;k<nums1.length;k++){
            nums1[k]=temp[k];
        }

    }

}
