package mygroup;

import java.util.Arrays;
import java.util.Stack;

public class BaseBallGame {

    public static void main(String[] args) {
        String[] input = {"5","-2","4","C","a","D","9","+","+"};
//        String[] input = {"5","2","C","D","+"};


        Stack<Integer> s=new Stack<Integer>();

//        System.out.println(Integer.valueOf("32")+Integer.valueOf("44"));


        for (int i=0;i<input.length;i++){
            if(input[i].matches("-?[0-9]{1,4}")) s.push(Integer.valueOf(input[i]));
            else if(input[i].matches("C")) s.pop();
            else if(input[i].matches("\\+")) s.push(s.peek()+s.get(s.size()-2));
            else if(input[i].matches("D")) s.push(s.peek()*2);
            else {System.out.println("Wrong input: "+input[i]); break;}
        }

        int sum=0;
        while (s.size()>0) sum+=s.pop();
        System.out.println(sum);

    }
}
