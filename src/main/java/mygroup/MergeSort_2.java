package mygroup;

import java.util.Arrays;

public class MergeSort_2 {
    public static void main(String[] args) {
        int[] input = {1,3,2,6,5,100,-23};

        sort(input,0,input.length-1);

        System.out.println(Arrays.toString(input));
    }

    public static void sort(int[] input,int l,int r) {
        if(l==r) return;

        int m=(l+r)/2;
        sort(input,l,m);
        sort(input,m+1,r);
        merge(input,l,m,r);
    }

    public static void merge(int[] input, int l, int m, int r){
        int length1 = m-l+1;
        int length2 = r-m;
        int[] left = new int[length1];
        int[] right = new int[length2];

        for(int i=0;i<length1;i++){
            left[i]=input[i+l];
        }

        for(int i=0;i<length2;i++){
            right[i]=input[m+i+1];
        }

        int k=l;
        int i=0;
        int j=0;
        while (i<length1&&j<length2){
            if(left[i]<right[j]) input[k++]=left[i++];
            else input[k++]=right[j++];
        }

        while (i<length1){
            input[k++]=left[i++];
        }

        while (j<length2){
            input[k++]=right[j++];
        }
    }

}
