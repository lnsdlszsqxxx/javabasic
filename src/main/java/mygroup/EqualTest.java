package mygroup;

public class EqualTest {

    public static int x=3;

    public static void main(String [] args){
        EqualTest a = new EqualTest();
        EqualTest b = new EqualTest();
        EqualTest c;
        c=a;
        System.out.println(a.equals(b));
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
