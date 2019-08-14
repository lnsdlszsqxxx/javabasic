package mygroup;

import javax.xml.transform.stream.StreamResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressionTest2 {

    public static void main(String [] args){
        List<Integer> x = Arrays.asList(1,2,3,4,5,6,7,8);
//        Stream  = x.stream().filter(e->e%2==0).mapToInt(e->e);

        System.out.println(x.stream().filter(e->e%2==0).mapToInt(e->e).sum());

//        //this is wrong because the lambda expression only allows final or effectively final parameters.
//        //In other words, you cannot change the parameter value once you use it in lambda expression.
//        int factor = 2;
//        Stream<Integer> strm = x.stream().filter(e->e%2==0).map(e->e*factor[0]);
//        factor = 1;

//        //a final array can still be changed, because the address of array is final the content is not.
//        //this example also proves that lambda expression is lazy.
//        final int[] factor = {2};
//        Stream<Integer> strm = x.stream().filter(e->e%2==0).map(e->e*factor[0]);
//        factor[0] = 1;

        //another example shows that lambda expression is lazy.
        int[] factor = {2};
        Stream<Integer> strm = x.stream().filter(e->e%2==0).map(e->e*factor[0]);
//        factor = new int[]{1}; //this is wrong
        factor[0] = 1; //this is correct



        strm.forEach(System.out::println);
    }
}
