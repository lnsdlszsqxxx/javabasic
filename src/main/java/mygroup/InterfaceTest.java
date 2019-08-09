package mygroup;

public class InterfaceTest implements Myinter{

    public void method1(){System.out.println("method1");}

    public void method2(){System.out.println("method2");}

    public static void main(String [] args){
        InterfaceTest temp = new InterfaceTest();
        temp.method1();
    }

}

interface Myinter{
      void method1();
      void method2();
}
