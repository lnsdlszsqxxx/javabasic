package mygroup;

import com.sun.tools.internal.xjc.reader.xmlschema.BindPurple;

import java.util.ArrayList;
import java.util.List;

public class Permutations46again {
    public static void main(String[] args) {
        int[] input = {1,2,3};
        System.out.println(permutation(input));
    }

    public static List<List<Integer>> permutation(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permute(nums,0,result);
        return result;
    }

    public static void permute(int[] nums,int start,List<List<Integer>> result){
        if(start==nums.length){
            List<Integer> temp= arrayToList(nums);
            result.add(temp);
            return;
        }

        for(int i=start;i<nums.length;i++){
            switchInt(nums,start,i);
            permute(nums,start+1,result);
            switchInt(nums,start,i);
        }
    }

    public static void switchInt(int[] nums, int i1, int i2){
        int temp=0;
        temp=nums[i1];
        nums[i1]=nums[i2];
        nums[i2]=temp;
    }

    public static List<Integer> arrayToList(int[] input){
        List<Integer> output = new ArrayList<>();
        for (int i=0;i<input.length;i++){
            output.add(input[i]);
        }
        return output;
    }

}
