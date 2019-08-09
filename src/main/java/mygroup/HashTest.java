package mygroup;

import java.util.HashMap;
import java.util.Map;

public class HashTest {

    public static void main(String [] args){
        Map<DataKey,Integer> myHM = getAllData();

        System.out.println(myHM.size());

        DataKey myDK = new DataKey();
        myDK.setId(1);
        myDK.setName("Wang");
        System.out.println(myDK.hashCode());

        Integer value = myHM.get(myDK);

        System.out.println(value);

    }

    public static Map<DataKey, Integer> getAllData(){
        Map<DataKey,Integer> myHashMap = new HashMap<>();

        DataKey myDK = new DataKey();
        myDK.setId(1);
        myDK.setName("Wang");
        System.out.println(myDK.hashCode());

        DataKey myDK2 = new DataKey();
        myDK2.setId(2);
        myDK2.setName("Liang");

        DataKey myDK3 = new DataKey();
        myDK3.setId(1);
        myDK3.setName("Wang");

        myHashMap.put(myDK, 100);
        myHashMap.put(myDK2, 200);
        myHashMap.put(myDK3, 300);


        return myHashMap;
    }

}
