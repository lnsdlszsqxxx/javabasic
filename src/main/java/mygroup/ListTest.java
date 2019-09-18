package mygroup;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {

        int[] y;


        List<Integer> temp = new ArrayList<>();

        temp.add(1);
        temp.add(2);

        temp.add(2,3);
        temp.add(0,33);
        temp.add(0,33);
        temp.set(0,9);
        temp.remove(0);
        temp.remove(0);
        int x = temp.get(1);

        System.out.println(temp.toString());
        System.out.println(x);
    }
}
