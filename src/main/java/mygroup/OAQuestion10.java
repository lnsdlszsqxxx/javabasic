package mygroup;

import java.util.Set;

public class OAQuestion10 {

    static class MyCollection<T>{
        private Set<T> set;
        public Set<T> getCollection(){
            return this.set;
        }
    }

    public static void main(String[] args) {

        MyCollection<String> myCollection = new MyCollection<>();
        testCollection(myCollection);

    }

    public static void testCollection(MyCollection<?> myCollection) {

        //which of the following can get a return value from myCollection.getCollection();
        Set<?> set = myCollection.getCollection();
//        Set<> set1 = myCollection.getCollection();
        Set set2 = myCollection.getCollection();
//        Set<T> set3 = myCollection.getCollection();
//        Set<E> set4 = myCollection.getCollection();

//        set2.add("adf");
//        set.add("adf");

    }
}

