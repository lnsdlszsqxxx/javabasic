package mygroup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {
        List<Integer> temp = new ArrayList<>();

        temp.add(1);
        temp.add(2);

        temp.add(3,3);
//        temp.add(5,5);

        System.out.println(Arrays.toString(temp.toArray()));
    }
}
