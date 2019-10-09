package mygroup;

public class JumpGame55 {
    public static void main(String[] args) {
        int[] input={2,3,1,1,0};
        int[] input2={3,2,1,0,4};
        System.out.println(canJump(input));
    }

    public static boolean canJump(int[] nums) {
        boolean result = false;
        int n=nums.length;

        for(int i=0;i<n;){
            if(nums[i]==0) {result=false; break;}
            i=i+ nums[i];
            if(i==n-1) {result = true; break;}
        }

        return result;
    }
}
