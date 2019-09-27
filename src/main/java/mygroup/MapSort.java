package mygroup;

import java.util.*;

public class MapSort {
    public static void main(String[] args) {
        Map<String, Integer> temp = new HashMap<>();

        System.out.println(temp.size());

        temp.put("hello",1);
        temp.put("hello2",2);
        temp.entrySet(); //how to get the first element.

        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("hello");
        list.add("hello");

        System.out.println(list);
    }

    public static LinkedHashMap<String, Integer> sort(HashMap<String, Integer> input){
        LinkedHashMap<String, Integer> output = new LinkedHashMap<>();
        List<Map.Entry<String,Integer>> temp =new  ArrayList(input.entrySet());
        return output;
    }
}
