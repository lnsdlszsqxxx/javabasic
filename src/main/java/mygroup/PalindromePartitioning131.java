//https://leetcode.com/problems/palindrome-partitioning/description/
package mygroup;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PalindromePartitioning131 {
    public static void main(String[] args) {
        String input = "aa";
        List<List<String>> result = partition(input);
        System.out.println(result.toString());
    }

    public static List<List<String>> partition(String s) {
        List<List<String>> partitions = new ArrayList<>();
        backtrack(s, partitions, new ArrayList<String>(), 0);
        return partitions;
    }

    public static void backtrack(String s, List<List<String>> partitions, ArrayList<String> temp, int start){

        if(start==s.length()) {
//            partitions.add(temp);
            partitions.add(new ArrayList<>(temp));
            return;
        }


        for (int i=start+1;i<s.length()+1;i++){
            String part = s.substring(start,i);
            if(isPalindrome(part)) {
                temp.add(part);
                backtrack(s,partitions,temp,i);
                temp.remove(temp.size()-1);
            }

        }

    }

    public static boolean isPalindrome(String s){
        int start=0;
        int end=s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

}
