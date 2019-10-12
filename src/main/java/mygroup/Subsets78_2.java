package mygroup;

import java.util.ArrayList;
import java.util.List;

public class Subsets78_2 {
    public static void main(String[] args) {
        int[] input = {1,2,3};
        System.out.println(subsets(input));

    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permutation(result,nums);

        return result;
    }

    public static void permutation(List<List<Integer>> result, int[] nums){

        //i is the number of elements for each element in the List
        for(int i=0;i<=nums.length;i++){
//        for(int i=2;i<=2;i++){
            List<Integer> temp=new ArrayList<>();
            permutationN(result,nums,temp,i,0);
        }
    }

    public static void permutationN(List<List<Integer>> result,int[] nums,List<Integer> temp, int n,int start){
        if(n==0) {
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start;i<nums.length;i++){
            temp.add(nums[i]);
            permutationN(result,nums,temp,n-1,i+1);
            temp.remove(temp.size()-1);
        }
    }
}
