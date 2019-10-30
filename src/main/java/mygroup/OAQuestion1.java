package mygroup;

public class OAQuestion1 {
    public static void main(String[] args) {
        String string1 = "my string";
        String string2 = new String("my string");
        System.out.println("guess which one is true:");
        System.out.println(string1.hashCode());
        System.out.println(string2.hashCode());
        System.out.println(myHashcode(string1));
        System.out.println(string1.hashCode()==string2.hashCode());
        System.out.println(string1==string2);
        System.out.println(string1.equals(string2));
        System.out.println(string1.matches(string2));
    }

    public static int myHashcode(String s){
        int h=0;
        for(int i=0;i<s.length();i++){
            h=h*31+s.charAt(i);
        }
        return h;
    }
}
