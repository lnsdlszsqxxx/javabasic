package mygroup;

import java.util.*;

public class MapSort_2 {
    public static void main(String[] args) {
        Map<String, Integer> temp = new HashMap<>();

        temp.put("hello",1);
        temp.put("hello2",2);
        temp.put("hello5",5);
        temp.put("hello3",3);

        LinkedHashMap<String,Integer> result = mapSort(temp);
        for(String key:result.keySet()){
            System.out.println(key+" "+result.get(key));
        }

        //same as above, but use a different way
        for(Map.Entry<String,Integer> entry:result.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }

    public static LinkedHashMap<String, Integer> mapSort(Map<String, Integer> map){

        LinkedHashMap<String, Integer> output = new LinkedHashMap<>();
        List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue()-o2.getValue();
            }
        });

        for(Map.Entry<String, Integer> entry:list){
            output.put(entry.getKey(),entry.getValue());
        }

        return output;
    }

}
