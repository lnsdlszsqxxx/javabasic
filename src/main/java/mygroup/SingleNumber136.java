package mygroup;

import java.util.Arrays;

public class SingleNumber136 {
    public static void main(String[] args) {
        int[] input1 = {2,2,1};
        int[] input2 = {4,2,1,2,1};

        System.out.println(singleNumber(input1));
        System.out.println(singleNumber(input2));
    }

    public static int singleNumber(int[] nums) {

        Arrays.sort(nums);
        for (int i=0;i<nums.length-1;i+=2){
            if (nums[i] != nums[i+1]){
                return nums[i];
            }
        }

        return nums[nums.length-1];

    }
}
