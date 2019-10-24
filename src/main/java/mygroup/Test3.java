package mygroup;


import java.util.HashSet;
import java.util.Set;

public class Test3 {

    public static void main(String[] args){
        String s="abc";
        System.out.println(s.equals("abc"));
        DataKey dataKey1=new DataKey();
        DataKey dataKey2=new DataKey();
        dataKey1.setId(1);
        dataKey2.setId(1);
        dataKey1.setName("liang1");
        dataKey2.setName("liang1");
        Set<DataKey> set = new HashSet<>();
        set.add(dataKey1);
        for(DataKey dataKey:set) {
            System.out.println(dataKey.toString());
        }
        set.add(dataKey2);
        for(DataKey dataKey:set) {
            System.out.println(dataKey.toString());
        }
    }
}
