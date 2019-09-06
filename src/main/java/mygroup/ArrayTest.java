package mygroup;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayTest {

    public static void main(String [] args){
        Integer[] temp = {3,6,1,7,8,4,23};
        System.out.println(Arrays.toString(temp));

        Arrays.sort(temp,(x1,x2)->-1);
        System.out.println(Arrays.toString(temp));

        String[] temp2 = {"hello","a","c","w","hellc"};
        System.out.println(Arrays.toString(temp2));

        Arrays.sort(temp2);
        System.out.println(Arrays.toString(temp2));

        double x1=3;
        double x2=4;
        System.out.println(x1);

        int[] t = {3,6,1,7,8,4,23};

        test(t);
        System.out.println(Arrays.toString(t));
    }

    public static void test(int[] x){
        x[3]=99;
    }
}
