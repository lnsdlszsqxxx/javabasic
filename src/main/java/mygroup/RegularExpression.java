package mygroup;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

    public static void main(String[] args) {
        String str1 = " /depart1ment, /dept,";
        String str5 = "/department";
        String str2 = " Derek Banas CA 12345 PA (412)555-1212 johnsmith@hotmail.com 412-555-1234 412 555-1234 ";
        String str4 = " (703)209-3879 701-201-3871 +1-412-555-1234 412 555-1234 ";

        String str3 = " 1Z aaa **** *** {{{ {{ { ";

//        String regex = "/dep\\w+,";
        String regex = "/";

        regexChecker(regex,str1);

    }

    public static void regexChecker(String regex,String str2Check){

        Pattern checkRegex = Pattern.compile(regex);
        Matcher matcher = checkRegex.matcher(str2Check);
        while (matcher.find()){
           if(matcher.group().length()!=0) System.out.println(matcher.group()+" start="+matcher.start()+" end="+matcher.end());
        }
    }
}
