package mygroup;

//this class proves that String is immutable.
public class MutableTest {

    public static void main(String[] args){

        String str1 = "Ryo";
//        System.out.println("str1: "+str1.hashCode());
        System.out.println("str1: "+System.identityHashCode(str1));

        String str2 = "Liang";
        str1 = "Hang";
        String str3 = new String("Ryo");
        String str4 = "R"+"yo";

//        System.out.println("str1: "+str1.hashCode()); //seems that hashcode doesn't return address.
 //       System.out.println("str1: "+System.identityHashCode(str1));
//        System.out.println("str3: "+str3.hashCode());
//        System.out.println("str4: "+str4.hashCode());

        System.out.println("str1: "+System.identityHashCode(str1)); //same variable but different address.
        System.out.println("str3: "+System.identityHashCode(str3)); //different address although the string value is the same.
        System.out.println("str4: "+System.identityHashCode(str4)); //same address as the first str1

    }
}

class user{
    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}

class Immutable{
    private final int x;
    private final int y;

    public Immutable(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}

class Mutable{
    private int x;
    private int y;

    public Mutable(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}

