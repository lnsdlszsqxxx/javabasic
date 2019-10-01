package mygroup;

import com.sun.org.apache.bcel.internal.generic.FSUB;
import com.sun.org.apache.xerces.internal.parsers.IntegratedParserConfiguration;

import java.util.ArrayList;
import java.util.List;

public class Subsets78 {
    public static void main(String[] args) {
        int[] input ={1,2,3};

        List<List<Integer>> result = subsets(input);
        System.out.println(result);
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> term = new ArrayList<>();
        for (int i = 0; i <= nums.length; i++){
            permutationForNElements(nums, result, term, 0, i);
        }
        return result;
    }

    public static void permutationForNElements(int[] nums, List<List<Integer>> result, List<Integer> term, int start, int n){
        if(n==0) {
            result.add(new ArrayList<>(term));
            return;
        }

        if (nums.length-start<n){
          return;
        }


            for(int i=start;i<nums.length;i++){
                term.add(nums[i]);
                permutationForNElements(nums,result,term,i+1,n-1);
                term.remove(term.size()-1);
            }

    }

}
