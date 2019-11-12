package mygroup;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressionTest3 {

    interface MyString{
        public String myStringFunction(String s);
    }

//    static public class LambdaTest implements MyString {
//        @Override
//        public String myStringFunction(String s){
//            return s+" hello";
//        }
//    }

    public static void main(String [] args){
        List<Integer> x = Arrays.asList(1,2,3,4,5,6,7,8);

        MyString myString1=(s1)->"Good morning "+s1+"!";
        MyString myString2=(s1)->"Good morning2 "+s1+"!";

        x.forEach(a->System.out.print(a));

        System.out.println(myString1.myStringFunction("aaa"));
        System.out.println(myString2.myStringFunction("aaa"));


    }
}
