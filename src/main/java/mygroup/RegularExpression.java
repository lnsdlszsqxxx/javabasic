package mygroup;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

    public static void main(String[] args) {
        String s1="abc acb \\\"abb aabbd aBcd";
        String s2="bbbb";
        String s3="bba aba abc ccc, bac   aaaaaaadc www";
        String regex="(?!(b\\w*))\\w+";

//        System.out.println(s1.matches("\\w.*"));
        RegexChecker(regex,s3);
    }

    public static void RegexChecker(String regex, String str2check){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str2check);

        while (matcher.find()){
            if (matcher.group().trim().length()!=0) System.out.println(matcher.group()+" start:"+matcher.start()+" end:"+matcher.end());
        }
    }
}