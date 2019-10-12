package mygroup;

import java.util.Arrays;

public class ReverseInteger7 {
    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(1230));
        System.out.println(reverse(-1230));
        String string=String.valueOf(1234);
        String string2=String.valueOf(1234);
        System.out.println(string);

    }

    static int reverse(int x) {

        int result=0;
        int sign=-1;
        int temp=x;
        if(x<0) x=x*sign;

        while(temp!=0){
            result=result*10+temp%10;
            temp=temp/10;
        }

        return x<0?result*sign:result;
    }
}
