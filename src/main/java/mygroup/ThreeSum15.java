package mygroup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeSum15 {
    public static void main(String[] args) {

        int[] input = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result=threeSum(input);
        System.out.println(result);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        int n=nums.length;
        if(n<3) return null;

        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i]+nums[j]+nums[k]==0) {
                        List<Integer> term=new ArrayList<>();

                        term.add(nums[i]);
                        term.add(nums[j]);
                        term.add(nums[k]);
                        if(!isExist(result,term)) result.add(term);
//                        term.clear();
                    }
                }
            }
        }
        return result;
    }

    public static boolean isExist(List<List<Integer>> result, List<Integer> term){
        if(result.size()==0) return false;

        for(List<Integer> element: result){
            if(isSame(element,term)) return true;
        }
        return false;
    }

    public static boolean isSame(List<Integer> element,List<Integer> term){
        Collections.sort(element);
        Collections.sort(term);
        for (int i=0;i<element.size();i++){
            if(element.get(i)!=term.get(i)) return false;
        }

        return true;
    }

}
