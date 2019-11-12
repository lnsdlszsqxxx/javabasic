package mygroup;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class Test5_removeList_iterator_stream {

    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("b");
        list.add("c");

//        list.remove(list.indexOf("b"));
//        while(list.indexOf("b")!=-1){
//            list.remove(list.indexOf("b"));
//        }

        //throw exception Concurrent Modification Exception
//        for(String e:list){
//            if(e.equals("b")) list.remove(e);
//        }

//        throw exception Concurrent Modification Exception
//        for(int i=0;i<list.size();i++){
//            if(list.get(i).equals("b")) list.remove(i);
//        }

//        //good
        Iterator<String> it=list.iterator();
        while(it.hasNext()){
            String s=it.next();
            if(s.equals("b")) it.remove();
        }

//        good
//        List<String> newList = list.stream().filter(e->!e.equals("b")).collect(Collectors.toList());
        System.out.println(list);
//        System.out.println(list.indexOf("dd"));
//        System.out.println(list);
//        System.out.println(newList);
    }
}
