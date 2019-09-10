//https://leetcode.com/problems/permutations-ii/
//done in 20 min;
package mygroup;

import java.util.ArrayList;
import java.util.List;

public class Permutations47 {
    public static void main(String[] args) {
        int[] input = {1,1,3};
        List<List<Integer>> output = permuteUnique(input);
        System.out.println(output.toString());
    }

    public static List<List<Integer>> permuteUnique(int[] input){
        List<List<Integer>> output = new ArrayList<>();
        permute(output,input,0);
        return output;
    }

    public static void permute(List<List<Integer>> output, int[] input, int start){

        if(start==input.length){
            List<Integer> temp = arrayToList(input);
            if(!output.contains(temp)) output.add(temp);
//            if(!isExist(output, temp)) output.add(temp);
        }


        for (int i=start;i<input.length;i++){
            swap(input,start, i);
            permute(output,input,start+1);
            swap(input,i,start);
        }
    }

    public static void swap(int[] input, int i, int j){
        int temp;
        temp=input[i];
        input[i]=input[j];
        input[j]=temp;
    }

    public static List<Integer> arrayToList(int[] input){
        List<Integer> output = new ArrayList<>();
        for (int i=0;i<input.length;i++){
            output.add(input[i]);
        }
        return output;
    }

    public static boolean isExist(List<List<Integer>> output, List<Integer> temp){

        for(List<Integer> out:output){
            if(isEqual(out,temp)) return true;
        }
        return false;
    }

    public static boolean isEqual(List<Integer> list1,List<Integer> list2){
        for (int i=0;i<list1.size();i++){
            if(list1.get(i)!=list2.get(i)) return false;
        }
        return true;
    }

}
