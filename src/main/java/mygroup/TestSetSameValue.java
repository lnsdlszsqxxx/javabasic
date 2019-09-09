//conclusion: set will call equals method to decide whether two objects are the same.
package mygroup;

import java.util.HashSet;
import java.util.Set;

public class TestSetSameValue {
    public static void main(String[] args) {
        Set<DataKey> temp = new HashSet<>();

        DataKey dataKey1 = new DataKey();
        DataKey dataKey2 = new DataKey();

        dataKey1.setName("Liang");
        dataKey1.setId(1);

        dataKey2.setName("Liang");
        dataKey2.setId(1);

        temp.add(dataKey1);
        System.out.println(temp.size());
        temp.add(dataKey2);
        System.out.println(temp.size());

    }
}
