//https://leetcode.com/problems/palindrome-partitioning/description/
package mygroup;

import sun.lwawt.macosx.CInputMethod;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning131_2 {
    public static void main(String[] args) {
        String input = "aab";
        List<List<String>> result = new ArrayList<>();
        List<String> each = new ArrayList<>();
        backtracking(result, each, input,0);
        System.out.println(result.toString());
    }

    public static void backtracking(List<List<String>> result, List<String> each, String s,int start) {

        if(start==s.length()&&isFull(s,each)){
            result.add(new ArrayList<>(each));
            return;
        }

        if(start==s.length()) return;

        for(int i=start;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(isPalindrome(s,i,j)) {
                    each.add(s.substring(i,j+1));
                    backtracking(result,each,s,j+1);
                    each.remove(each.size()-1);
                }
            }
        }
        return;
    }

    public static boolean isPalindrome(String s,int start,int end){
        int i=start;
        int j=end;
        while (i<j){
            if(s.charAt(i++)!=s.charAt(j--)) return false;
        }
        return true;
    }

    public static boolean isFull(String s, List<String> each){
        int n=s.length();
        int counter = 0;
        for(int i=0;i<each.size();i++){
            counter+=each.get(i).length();
        }
        return counter==n?true:false;
    }

}
