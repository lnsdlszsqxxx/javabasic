package mygroup;


import java.util.*;
import java.util.stream.Collectors;

public class Test6_removeMap_iterator_stream {

    public static void main(String[] args){

        Map<String, Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("b",1);
        map.put("c",1);
        map.put("d",2);

        Iterator<Map.Entry<String, Integer>> it=map.entrySet().iterator();

//        while (it.hasNext()) {
//            String key=it.next().getKey();
//            if(map.get(key)==1) it.remove();
//        }



        System.out.println(map);
    }
}
