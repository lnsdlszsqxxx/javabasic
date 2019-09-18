package mygroup;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

    public static void main(String[] args) {
        String s1="/abc a.cb \\\"abb aabbd aBcd";
        String s2="bbbb";
        String s3="bba aba abc ccc, bac   aaaaaaadc www";
        String s4="jex pr300es,sion4000!qefqon>";
        String s5="/depart/account";
        String s6="adfweofij [01/ajsif/13-9:aoeif] GET /adsfoi/adofij-da/alfj.jpg asfjeiq";
        String regex="eig$";

//        System.out.println(s1.replaceAll("\\s",""));
//        System.out.println(s1);
//        System.out.println(s1.matches("\\w.*"));
        System.out.println(System.getenv("SENDGRID_API_KEY"));
        System.out.println(System.getenv("JAVA_HOME"));
        RegexChecker(regex,s6);
    }

    public static void RegexChecker(String regex, String str2check){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str2check);

        while (matcher.find()){
            if (matcher.group().trim().length()!=0) System.out.println(matcher.group()+" start:"+matcher.start()+" end:"+matcher.end());

//            System.out.println(matcher.group(1));
//            System.out.println(matcher.group(2));
//            System.out.println(matcher.group(3));
        }
    }
}