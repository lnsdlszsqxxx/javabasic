package mygroup;


import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Thread.sleep;

public class Test7_System_nanoTime {

    public static void main(String[] args) throws Exception{

       float t1= System.nanoTime();
       sleep(5000);
       float t2= System.nanoTime();
       System.out.println(t2-t1);
    }

}
