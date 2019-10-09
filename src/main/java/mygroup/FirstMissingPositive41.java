package mygroup;

import java.util.Arrays;

public class FirstMissingPositive41 {
    public static void main(String[] args) {

        int [] input = {3,4,-1,1};
        int [] input2 = {1,2,0};
        int [] input3 = {7,8,9,11,12};
        System.out.println(firstMissingPositive(input));
        System.out.println(firstMissingPositive(input2));
        System.out.println(firstMissingPositive(input3));
    }

    public static int firstMissingPositive(int[] nums) {
        int min=1;
        int n=nums.length;
        int indexMin=-1;
        Arrays.sort(nums);
        if(nums[0]>1) return 1;
        if(nums[n-1]<1) return 1;

        for(int i=0;i<n;i++){
            if(nums[i]<1) continue;
            if(indexMin<0) indexMin=i;
            if(nums[indexMin]>1) return 1;

            if(nums[i]-min>1) return min+1;
            min=nums[i];

        }

        return min+1;
    }
}
