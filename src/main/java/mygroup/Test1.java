package mygroup;

public class Test1 {

    public static int a=3;
    String name="Liang";

    public static void main(String args[]){

        Test1 temp = new Test1();
        System.out.println(temp.toString());

    }


    @Override
    public String toString() {
        return name+", "+a;
    }
}
