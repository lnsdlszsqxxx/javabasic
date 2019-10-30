package mygroup;

public class OAQuestion27 implements I2{
    int x=9;

    public static void main(String[] args) {

        System.out.println(I2.name+", "+I2.s1+", ");
        System.out.println(((I1) new OAQuestion27()).name);
    }

    public void print(){
        System.out.println(this.x);
    }
}

interface I1{
    String name="N1";
    String s1="S1";
}

interface I2 extends I1{
    String name="N2";
}
