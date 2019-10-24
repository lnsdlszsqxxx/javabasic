package mygroup;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test4 {

    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(23);
        list.add(2);
        System.out.println(list);
        list.remove(1);
        list.add(1,11);
        System.out.println(list);
        System.out.println(list.indexOf(2));
    }
}
