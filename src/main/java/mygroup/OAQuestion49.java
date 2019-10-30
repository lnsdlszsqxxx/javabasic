package mygroup;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OAQuestion49 {


    public static void main(String[] args){

        System.out.println(Stream.of("green","yellow","blue")
                .max((s1,s2)->s1.compareTo(s2))
                .filter(s->s.endsWith("n"))
                .orElse("yellow"));

    }
}
