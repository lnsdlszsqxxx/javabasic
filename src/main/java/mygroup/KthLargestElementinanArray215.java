package mygroup;

public class KthLargestElementinanArray215 {
    public static void main(String[] args) {
        int[] input = {3,2,1,5,6,4};
        int k = 3;
        System.out.println(findKthLargest(input,k));
    }

    public static int findKthLargest(int[] nums, int k) {
        for(int j=0;j<k;j++){
            for(int i=0;i<nums.length-1-j;i++){
                if(nums[i]>nums[i+1]) {
                    int temp = nums[i];
                    nums[i]=nums[i+1];
                    nums[i+1]=temp;
                }
            }
        }

        return nums[nums.length-k];
    }
}
