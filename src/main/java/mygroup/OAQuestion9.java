package mygroup;

import java.util.Optional;

public class OAQuestion9 {


    public static void main(String[] args) {

        String a = null;
        Optional<String> b = Optional.empty();
        try {
            System.out.print(b.orElse("").length());
            System.out.print(a.length());
        }
        catch (Exception ex){
            System.out.print(a);
        }
        finally {
            a = "String";
            System.out.print(a.length());

            b=Optional.ofNullable("");
            System.out.println(b.get().length());
        }
    }
}
