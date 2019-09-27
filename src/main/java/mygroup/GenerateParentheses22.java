package mygroup;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//https://leetcode.com/problems/generate-parentheses/

public class GenerateParentheses22 {
    public static void main(String[] args) {
       System.out.println(generateParenthesis(2));
    }

    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        Set<String> resultSet = new HashSet<>();
        char[] term=new char[2*n];
        generator(resultSet,term,0,2*n-1,n);
        result = setToList(resultSet);
        return result;
    }

    public static void generator(Set<String> result, char[] term, int start, int end, int n){
        if(termIsFull(term)){
            String temp = charToString(term);
            result.add(temp);
            return;
        }
        if(start>=end){
            return;
        }

        char left='(';
        char right=')';

            term[start]=left;
            for(int j=start+1;j<=end;j=j+2){
                term[j]=right;
                    generator(result,term,j+1,end,n);

                        generator(result, term, start + 1, j - 1, n);
                        rollback(term, start + 1, j - 1);

                    rollback(term,j+1,end);
            }

    }

    public static String charToString(char[] input){
        String output="";
        for (char a: input){
            output=output+a;
        }
        return output;
    }

    public static boolean termIsFull(char[] input){
        for(int i=0;i<input.length;i++){
            if(!(input[i]=='(' || input[i]==')')) return false;
        }
        return true;
    }

    public static void rollback(char[] input, int i1, int i2){
        for (int i=i1;i<=i2;i++){
            input[i] = 'a';
        }
    }

    public static List<String> setToList(Set<String> input){
        List<String> output = new  ArrayList();

        for (String s:input){
            output.add(s);
        }

        return output;
    }

}
