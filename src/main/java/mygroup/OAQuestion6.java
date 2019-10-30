package mygroup;

public class OAQuestion6 extends Test6Parent{
    public OAQuestion6(){
        System.out.println("child1");

        count+=1;
    }

    public OAQuestion6(String s){
        System.out.println("child2");

        count+=100;
    }

    public static void main(String[] args) {
        System.out.println(getCount());
        OAQuestion6 test6 = new OAQuestion6();
        System.out.println(getCount());

        count=0;
        OAQuestion6 test61 = new OAQuestion6("sd");
        System.out.println(getCount());
    }
}

class Test6Parent{
    protected static int count=0;
    public Test6Parent(){
        System.out.println("parent1");
        count+=30;
    }

    public Test6Parent(String s){
        System.out.println("parent2");
        count+=3000;
    }

    static int getCount(){
        return count;
    }
}
