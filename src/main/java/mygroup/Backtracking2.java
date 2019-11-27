package mygroup;

import java.util.ArrayList;
import java.util.List;

//find all of the palindrome substring
public class Backtracking2 {
    public static void main(String[] args) {
        String input="aaba";
        List<List<String>> list=palindrome(input);
        System.out.println(list);
    }

    public static List<List<String>> palindrome(String input){
        List<List<String>> result=new ArrayList<>();
        dotracking(input, new ArrayList<String>(), result,0);
        return result;
    }

    public static void dotracking(String input , List<String> each, List<List<String>> result,int start){
        if(start==input.length()){
            List<String> temp=new ArrayList<>();
            copy(temp,each);
            result.add(temp);
            return;
        }

        for(int i=start;i<input.length();i++){
            String sub = input.substring(start,i+1);
            if(isPalindrome(sub)) {
                each.add(sub);
                dotracking(input,each,result,i+1);
                each.remove(each.size()-1);
            }
        }
    }

    public static boolean isPalindrome(String sub){
        int i=0;
        int j=sub.length()-1;
        while(i<j){
            if(sub.charAt(i)!=sub.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void copy(List<String> temp,List<String> each){
        for(int i=0;i<each.size();i++){
            temp.add(each.get(i));
        }
    }
}
