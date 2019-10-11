package mygroup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JumpGameII45 {
    public static void main(String[] args) {

        int[] input = {2,3,1,1,4};
        System.out.println(jump(input));
    }

    public static int jump(int[] nums) {
        int steps=0;
        List<Integer> result=new ArrayList<>();

        stepCounter(nums,0,steps,result);

        Collections.sort(result);
        steps=result.get(0);
        return steps;
    }

    public static void stepCounter(int[] nums, int start, int steps, List<Integer> results){
        if(start>=nums.length) {
            return;
        }
        if(start==nums.length-1){
            results.add(steps);
            return;
        }

        for(int i=1;i<=nums[start];i++){
            steps++;
            stepCounter(nums,start+i,steps,results);
            steps--;
        }
    }
}
