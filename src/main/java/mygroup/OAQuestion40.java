package mygroup;

public class OAQuestion40 {

    static int total=10;
    public void call(){
        int total=5;
        System.out.println(this.total);
    }

    public static void main(String[] args){

        OAQuestion40 a=new OAQuestion40();
        a.call();
    }
}
