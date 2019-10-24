//https://leetcode.com/problems/palindrome-partitioning/description/
package mygroup;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning131_3 {
    public static void main(String[] args) {
        String input = "aabbba";
        List<List<String>> result = new ArrayList<>();
        List<String> each = new ArrayList<>();
        backtracking(result,each,input,0);
        System.out.println(result.toString());
    }

    public static void backtracking(List<List<String>> result,List<String> each, String input, int start){
        int n=input.length();

        if(start==n){
            if(isFull(each,n)) result.add(new ArrayList<>(each));
            return;
        }

        for(int i=start;i<n;i++){
            for(int j=i+1;j<=n;j++){
                if(isPalindrome(input.substring(i,j))) {
                    each.add(input.substring(i,j));
                    backtracking(result,each,input,j);
                    each.remove(each.size()-1);
                }
            }
        }

    }

    public static boolean isPalindrome(String s){
        int n=s.length();
        int i=0;
        int j=n-1;

        while(i<j){
            if(s.charAt(i++)!=s.charAt(j--)) return false;
        }

        return true;
    }


    public static boolean isFull(List<String> each,int n){
        int letters=0;
        for(String s:each){
            letters+=s.length();
        }
        return letters==n?true:false;
    }
}
