package mygroup;

import com.sun.xml.internal.rngom.digested.DGroupPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagrams49 {
    public static void main(String[] args) {

        String [] input = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> result=groupAnagrams(input);
        System.out.println(result);

    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> output=new ArrayList<>();

        List<String> strsList = stringToList(strs);
        List<Integer> index = new ArrayList<>();


        for(int i=0;i<strsList.size();i++){
            if(doesExitIndex(i,index)) continue;

            List<String> term = new ArrayList<>(); //store each term in the final output

            String temp = strsList.get(i);
            term.add(temp);
            index.add(i);

            for(int j=i+1;j<strs.length;j++){
                if(isAnagram(temp,strsList.get(j))) {
                    term.add(strsList.get(j));
                    index.add(j);
                }
            }


            output.add(term);
        }

        return output;
    }

    public static boolean isAnagram(String s1,String s2){
        if(s1.length()!=s2.length()) return false;
        int n = s1.length();
        char[] c1=new char[n];
        char[] c2=new char[n];
        for(int i=0;i<n;i++){
            c1[i] = s1.charAt(i);
            c2[i] = s2.charAt(i);
        }

        Arrays.sort(c1);
        Arrays.sort(c2);

        for(int i=0;i<n;i++){
            if(c1[i]!=c2[i]) return false;
        }

        return true;
    }

    public static List<String> stringToList(String[] input){
        List<String> output = new ArrayList<>();

        for(int i=0;i<input.length;i++){
            output.add(input[i]);
        }
        return output;
    }

    public static boolean doesExitIndex(int i,List<Integer> index){
        for (int j=0;j<index.size();j++){
            if(index.get(j)==i) return true;
        }

        return false;
    }

}
