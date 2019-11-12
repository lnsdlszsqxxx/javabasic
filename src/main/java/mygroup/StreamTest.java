package mygroup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class StreamTest {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(6);
        list.add(44);
        list.add(12);
//        list.stream().forEach(System.out::print);
        System.out.println(list.stream().filter(x->x>3).distinct().limit(3).sorted());

        List<DataKey> dataKeys=new ArrayList<>();
        DataKey dataKey1=new DataKey(1,"s1");
        DataKey dataKey2=new DataKey(2,"s5");
        DataKey dataKey3=new DataKey(3,"s4");
        DataKey dataKey4=new DataKey(4,"s2");
        dataKeys.add(dataKey1);
        dataKeys.add(dataKey2);
        dataKeys.add(dataKey3);
        dataKeys.add(dataKey4);
        System.out.println(dataKeys.stream().map(DataKey::getName).collect(Collectors.toList()));

        List<String> input = new ArrayList<>();
        input.add("hi1 hell xx");
        input.add("hi2 ad daf e");
        input.add("hi3 aaa dfa ecv da");
        input.add("hi4 qq e erqwe");

//        input.stream().flatMap((value) -> { String[] split = value.split(" "); return  Arrays.asList(split).stream();}).forEach(System.out::println);
        String s= input.stream().reduce((combinedValue,value) -> {
            return combinedValue + " + " + value;
        }).get();
        System.out.println(s);
    }
}
