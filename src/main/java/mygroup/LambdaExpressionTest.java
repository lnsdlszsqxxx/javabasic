package mygroup;

public class LambdaExpressionTest {
    public static String str1 = "Liang";

    {
        System.out.println("block statement");
    }



    public static void main(String [] args){
         String str2 = "Yu";

    MyInterface temp = x -> System.out.println(x+str1+str2);
    temp.method1("Hello World!");

//    str2 += "hahaha";
        temp.method1("Hello World!");

        LambdaExpressionTest temp2 = new LambdaExpressionTest();

    }
}

interface MyInterface{
    public void method1(String x);
}
