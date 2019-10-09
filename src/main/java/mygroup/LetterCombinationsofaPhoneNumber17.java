package mygroup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LetterCombinationsofaPhoneNumber17 {
    public static void main(String[] args) {

        System.out.println(letterCombinations("23"));

    }

    public static List<String> letterCombinations(String digits) {
        int n = digits.length();

        List<String> map = new ArrayList<>();
        map.add(" ");
        map.add("");
        map.add("abc");
        map.add("def");
        map.add("ghi");
        map.add("jkl");
        map.add("mno");
        map.add("pqrs");
        map.add("tuv");
        map.add("wxyz");


        int[] indices = new int[n];

        for(int i=0;i<n;i++){
            int j=Character.getNumericValue(digits.charAt(i));
            indices[i]=j;
        }

        String[] permu = new String[n];
        for(int i=0;i<n;i++){
            permu[i]=map.get(indices[i]);
        }

        String string="";
        List<String> output = new ArrayList<>();

        permutation(output,permu,0,string);

        return output;
    }

    public static void permutation(List<String> output, String[] input, int j,String string){
        if(j==input.length){
            output.add(new String(string));
            return;
        }

        for(int i=0;i<input[j].length();i++){
            string = string+input[j].charAt(i);
            permutation(output, input,j+1,string);
            string=string.substring(0,string.length()-1);
        }

    }
}
