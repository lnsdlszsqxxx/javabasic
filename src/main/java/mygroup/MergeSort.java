package mygroup;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] input = {1,3,2,6,5,100,-23};

        sort(input,0,input.length-1);

        System.out.println(Arrays.toString(input));
    }

    public static void sort(int[] input,int l,int r){
        if (l<r) {
            int m = (l + r) / 2;
            sort(input, l, m);
            sort(input, m + 1, r);
            merge(input, l, m, r);
        }
    }

    public static void merge(int[] input,int l, int m, int r){

        int[] left=new int[m-l+1];
        int[] right=new int[r-m];
        for(int i=0;i<m-l+1;i++){
            left[i]=input[i+l];
        }
        for(int i=0;i<r-m;i++){
            right[i]=input[i+m+1];
        }

        int il=0;
        int ir=0;
        int k=l;

        while (il<m-l+1&&ir<r-m){
            if(left[il]<right[ir]) input[k++]=left[il++];
            else input[k++]=right[ir++];
        }

        while (il<m-l+1){
            input[k++]=left[il++];
        }

        while (ir<r-m){
            input[k++]=right[ir++];
        }

    }
}
