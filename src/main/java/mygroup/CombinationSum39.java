//https://leetcode.com/problems/combination-sum/
package mygroup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CombinationSum39 {
    public static void main(String[] args) {

//        int[] input = {2,3,6,7};
        int[] input = {2,3,5};
        int target=8;
        List<List<Integer>> output = combinationSum(input,target);
        System.out.println(output.toString());
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        combine(output,temp, candidates,target,0);
        return output;
    }

    public static void combine(List<List<Integer>> output,List<Integer> temp, int[] candidates,int target, int start){
        int sum = sum(temp);
        if(sum>target) return;
        if(sum==target){
            if(!isExist(output,temp)) output.add(new ArrayList<>(temp));
            return;
        }

        for(int i=start;i<candidates.length;i++){
            if(sum<target) {
                temp.add(candidates[i]);
                combine(output, temp, candidates, target, start);
                temp.remove(temp.size()-1);
            }
        }
    }

    public static int sum(List<Integer> temp){
        int sum=0;
        for (Integer i:temp){
            sum=sum+i;
        }
        return sum;
    }

    public static boolean isExist(List<List<Integer>> output,List<Integer> temp){
        for (List<Integer> out:output){
            if(isEqual(out,temp)) return true;
        }
        return false;
    }

    public static boolean isEqual(List<Integer> temp1,List<Integer> temp2){
        Collections.sort(temp1);
        Collections.sort(temp2);
        for (int i=0;i<temp1.size();i++){
            if(temp1.get(i)!=temp2.get(i)) return false;
        }
        return true;
    }
}
