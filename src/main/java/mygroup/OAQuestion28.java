package mygroup;

public class OAQuestion28{

    static class Parent1{
        public Parent1(){
            System.out.println("parent1");
        }
    }

    static class Parent2 extends Parent1{
        public Parent2(){
            System.out.println("parent2");
        }
    }

    static class Child extends Parent2{
        public Child(){

            this(3);
            System.out.println("child");
        }
        public Child(int x){

            System.out.println("child "+x);
        }
    }


    public static void main(String[] args) {
        new Child();
        System.out.println("main");
    }
}
