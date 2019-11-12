package mygroup;

import java.util.*;

public class MapSort{
    public static void main(String[] args)  {
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


    public static String mapSort(Map<Character,Integer> input){
        LinkedHashMap<Character,Integer> output = new LinkedHashMap<Character,Integer>();

        List<Map.Entry<Character,Integer>> temp =new ArrayList<Map.Entry<Character,Integer>>(input.entrySet());

//        temp.sort(Map.Entry.comparingByValue());

        //use Collections to sort
        Collections.sort(temp, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        for(Map.Entry<Character,Integer> entry: temp){
            output.put(entry.getKey(),entry.getValue());
        }


        int n=temp.size();
        if(n<2) return "null";
        if(temp.get(n-1).getValue()==1) return  "null";
        if(temp.get(n-1).getValue()==temp.get(n-2).getValue()) return "tie";

        return Character.toString(temp.get(n-1).getKey());

    }

}
