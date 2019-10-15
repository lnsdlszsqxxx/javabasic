//https://leetcode.com/problems/combination-sum/
package mygroup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CombinationSum39_2 {
    public static void main(String[] args) {

        int[] input = {2,3,6,7};
//        int[] input = {2,3,5};
        int target=7;
        List<List<Integer>> output = combinationSum(input,target);
        System.out.println(output.toString());
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> each = new ArrayList<>();

        combination(result,each, candidates,target,0);
        return result;
    }

    public static void combination(List<List<Integer>> result,List<Integer> each, int[] candidates, int target, int start){
        if(target<0){
            return;
        }
        if(target==0){
            result.add(new ArrayList<>(each));
            return;
        }

        for(int i=start;i<candidates.length;i++){
            each.add(candidates[i]);
            combination(result,each,candidates,target-candidates[i],i);
            each.remove(each.size()-1);
        }
        return;
    }

}
