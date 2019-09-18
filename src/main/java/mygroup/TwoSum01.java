package mygroup;

import java.util.Arrays;

public class TwoSum01 {
    public static void main(String[] args) {
        int[] input = {2, 7, 11, 15};
        int target = 9;
        int[] output = sum(input, target);
        System.out.println(Arrays.toString(output));
    }

    public static int[] sum(int[] input, int target){
        int[] output = new int[2];
        for (int i=0;i<input.length-1;i++){
            for(int j=i+1;j<input.length;j++){
                if(input[i]+input[j]==target) {
                    output[0]=i;
                    output[1]=j;
                    return output;
                }

            }
        }

        return null;
    }
}
