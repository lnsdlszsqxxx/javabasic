package mygroup;

import java.util.ArrayList;
import java.util.List;

public class Backtracking {
    public static void main(String[] args) {
        String input="abcd";
        List<String> list=backtracking(input);
        System.out.println(list);
    }

    public static List<String> backtracking(String input){
        List<String> result=new ArrayList<>();
        char[] inputChar=input.toCharArray();
        dotracking(inputChar,result,0);
        return result;
    }

    public static void dotracking(char[] inputChar , List<String> result,int start){
        if(start==inputChar.length){
            result.add(new String(inputChar));
            return;
        }
        for(int i=start;i<inputChar.length;i++){
            swap(inputChar,start,i);
            dotracking(inputChar,result,start+1);
            swap(inputChar,start,i);
        }
    }

    public static void swap(char[] inputChar,int start,int i){
        char temp=inputChar[start];
        inputChar[start] = inputChar[i];
        inputChar[i]=temp;
    }

}
