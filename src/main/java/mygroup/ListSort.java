package mygroup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSort {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(22);
        list.add(3);
        list.add(6);
        list.add(65);

        System.out.println(list.contains(22));
        System.out.println(list.indexOf(22));
        System.out.println(list.get(1));

        MyComparator myComparator = new MyComparator();


        Collections.sort(list,myComparator);

        System.out.println(list);

    }

}

class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1,Integer o2){
        return o1;
    }
}
