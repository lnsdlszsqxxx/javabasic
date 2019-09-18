package mygroup;

//reference
//https://stackoverflow.com/questions/10594052/overriding-vs-hiding-java-confused

public class OverridingAndHiding {
    public static void main(String[] args) {
//        Father father = new Father();
//        Son son = new Son();
//
//        father.method1();
//        father.method2();
//        son.method1();
//        son.method2();
        new Son();
        new Father();
    }
}

class Father {
    public static void method1(){
        System.out.println("father method1");
    }

    public void method2(){
        System.out.println("father method2");
    }

    public Father(){
        System.out.println("father constructor");
        method1();
        method2();
        System.out.println("father constructor ends");
    }
}

class Son extends Father {
    public static void method1(){
        System.out.println("son method1");
    }

    public void method2(){
        System.out.println("son method2");
    }

    public Son(){
        System.out.println("son constructor");
        method1();
        method2();
        System.out.println("son constructor ends");

    }
}