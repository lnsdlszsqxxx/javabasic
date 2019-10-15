package mygroup;

import java.util.Arrays;

public class SingleNumber136_2 {
    public static void main(String[] args) {
        int[] input1 = {2,2,1};
        int[] input2 = {4,2,1,2,1};

        System.out.println(singleNumber(input1));
        System.out.println(singleNumber(input2));
    }

    public static int singleNumber(int[] nums) {
        int result=0;
        for(int n:nums){
            result^=n;
        }

        return result;
    }
}
