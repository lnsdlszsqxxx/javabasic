package mygroup;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class InterfaceTest implements MyInter{

    public void method1(){System.out.println("method1");}

    public void method2(){System.out.println("method2");}

    public static void main(String [] args){
        InterfaceTest temp = new InterfaceTest();
        temp.method1();
        temp.method2();
    }

}

interface MyInter{
      public void method1();
      abstract void method2();
}
