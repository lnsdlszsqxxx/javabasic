package mygroup;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Permutations46again_2 {
    public static void main(String[] args) {
        int[] input = {1,2,3};
        List list = new ArrayList();
        list.add(3);
        System.out.println(list.indexOf(4));
        System.out.println(list.contains(4));
        System.out.println(permutation(input));
    }

    public static List<List<Integer>> permutation(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        List<Integer> each = new ArrayList<>();

        perm(nums,each,result);

        return result;
    }

    public static void perm(int[] nums, List<Integer> each,List<List<Integer>> result){
        if(each.size()==nums.length) {
            List<Integer> temp = new ArrayList<>(each);
            result.add(temp);
            return;
        }

        for(int i=0;i<nums.length;i++) {
            if(!each.contains(nums[i])) {
//            if(each.indexOf(nums[i])==-1) {
                each.add(nums[i]);
                perm(nums, each, result);
//                each.remove(each.indexOf(nums[i]));
                each.remove(each.size()-1);
            }
        }
    }

}
