package mygroup;

public class FindMinimuminRotatedSortedArray153 {
    public static void main(String[] args) {
        int[] input = {3,4,5,1,2};

        System.out.println(findMin(input));

    }

    public static int findMin(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]) return nums[i+1];
        }

        return nums[0];

    }
}
