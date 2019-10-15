package mygroup;

public class BinarySearch {
    public static void main(String[] args) {
        int[] input = {1,2,3,4,5,5,5,6,7,8};

        System.out.println(binary(input,5));
    }

    public static int binary(int[] input,int target){
        int l=0;
        int r=input.length-1;

        while (l<r){
            int m=(l+r)/2;
            if(input[m]<=target) l=m;
            else r=m-1;
        }

        return r;
    }
}
