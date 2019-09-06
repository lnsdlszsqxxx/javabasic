//https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
//no extra space
//time complexity is O(n)
package mygroup;


import java.util.ArrayList;
import java.util.List;

public class FindDuplicateValue2 {

    public static void main(String[] args) {
       int[] input = {4,3,2,7,8,2,3,1,8};
       List<Integer> results = search(input);
       System.out.println(results.toString());
    }

    public static List<Integer> search(int[] x){

        List<Integer> results= new ArrayList<>();

        for (int i=0;i<x.length;i++){

            if(x[Math.abs(x[i])-1]<0) results.add(Math.abs(x[i]));
            x[Math.abs(x[i])-1] *= -1;
        }

        return results;
    }
}
