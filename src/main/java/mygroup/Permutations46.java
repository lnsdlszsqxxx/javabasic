//https://leetcode.com/problems/permutations/
package mygroup;

import java.util.ArrayList;
import java.util.List;

public class Permutations46 {
    public static void main(String[] args) {
        int[] input = {1,2,3,4};
        List<List<Integer>> output = permutation(input);
            System.out.println(output.toString());

    }

    public static List<List<Integer>> permutation(int[] input){
        List<List<Integer>> output = new ArrayList<>();
        permute(output,input,0);
        return output;
    }

    public static void permute(List<List<Integer>> output, int[] input, int start){
        if(start==input.length) {
            List<Integer> temp= arrayToList(input);
            output.add(temp);
            return;
        }
        for (int i=start;i<input.length;i++){
            swap(input,start,i);
            permute(output,input,start+1);
            swap(input,i,start);
        }
    }

    public static void swap(int[] input, int start, int i){
        int temp;
        temp=input[start];
        input[start]=input[i];
        input[i]=temp;
    }

    public static List<Integer> arrayToList(int[] array){
        List<Integer> output = new ArrayList<>();
        for (int a:array){
            output.add(a);
        }
        return output;
    }

}
