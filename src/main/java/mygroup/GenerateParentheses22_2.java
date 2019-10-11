package mygroup;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses22_2 {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(2));
    }

    public static List<String> generateParenthesis(int n) {

        List<String> result = new ArrayList<>();
        String temp="";
        generator(result,temp,0,0,n);

        return result;
    }

    public static void generator(List<String> result, String temp, int open, int close,int n){
        if(temp.length()==n*2) {
            result.add(temp);
            return;
        }

        if(open<n)
        generator(result,temp+"(",open+1,close,n);

        if(close<open)
        generator(result,temp+")",open,close+1,n);


    }
}
