package mygroup;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {


    public static void main(String [] args) {
        Map<Integer, String> myhashmap = new HashMap<>();
        myhashmap.put(1,"Liang");
        myhashmap.put(2,"Huang");
        myhashmap.put(5,"Wang");
        myhashmap.put(4,"Ming");
        myhashmap.put(100,"Momo");

        System.out.println(myhashmap);
        System.out.println(myhashmap.size());

        for (String str:myhashmap.values()
             ) {
            System.out.println(str);
        }

        String temp="Hello World!";
        System.out.println(temp.charAt(0));

    }
}
