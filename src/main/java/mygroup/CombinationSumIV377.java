package mygroup;

public class CombinationSumIV377 {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        int target = 4;
        System.out.println(combinationSum4(nums,target));

    }

    public static int combinationSum4(int[] nums, int target) {
        if(target==0) return 1;
        if(target<0) return 0;

        int counter=0;
        int n = nums.length;

        for(int i=0;i<n;i++){
            counter = counter + combinationSum4(nums,target-nums[i]);
        }

        return counter;
    }

}

