package mygroup;

import java.util.Arrays;

public class ProductofArrayExceptSelf238 {

    public static void main(String[] args) {
        int[] input = {1,2,3,4};
        int[] output = productExceptSelf(input);
        System.out.println(Arrays.toString(output));
    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output=new int[n];
        int sum=0;

        for(int i=0;i<n;i++){

            sum=1;

            for (int j=0;j<n;j++){
                if(j==i) continue;
                sum=sum*nums[j];
            }

            output[i]=sum;
        }

        return output;
    }
}
