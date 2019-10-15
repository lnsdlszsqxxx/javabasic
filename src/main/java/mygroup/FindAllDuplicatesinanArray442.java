package mygroup;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllDuplicatesinanArray442 {
    public static void main(String[] args) {
        int[] nums={4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));
    }

    public static List<Integer> findDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for(int n:nums){
            if(!set.add(n)){
                result.add(n);
            }
        }

        return result;

    }

}

