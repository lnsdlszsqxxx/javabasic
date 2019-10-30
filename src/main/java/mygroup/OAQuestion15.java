package mygroup;

import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class OAQuestion15 {

    public static void main(String[] args) {

        Supplier<String> i=()->"Car";
        Consumer<String> c=x->System.out.println(x.toLowerCase());
        Consumer<String> d=x->System.out.println(x.toUpperCase());
        c.andThen(d).accept(i.get());
//        System.out.println();

        Consumer < String > consumer1 = (arg) -> {
                System.out.println(arg + "OK");
        };
        consumer1.accept("TestConsumerAccept - ");
        Consumer < String > consumer2 = (x) -> {
                System.out.println(x + "OK!!!");
        };
        consumer1.andThen(consumer2).accept("TestConsumerAfterThen - ");
    }

}

