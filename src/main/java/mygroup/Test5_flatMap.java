package mygroup;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test5_flatMap {

    public static void main(String[] args){
        int[][] map={{1,2,3},{4,5,6},{7,8,9}};
        Stream.of(map).flatMap(Stream::of);
        Stream.of(map).flatMap(e->Stream.of(e)).flatMap(e->Stream.of(e)).collect(Collectors.toList());
    }

}
