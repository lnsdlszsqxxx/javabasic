package mygroup;

import com.sun.jdi.connect.spi.TransportService;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

    public static void main(String[] args) {

        User user= new User();
        Queue q=new LinkedList();

        user.setAge(44);
        user.setId(1);
        user.setName("Liang");

        q.add(1);
        q.add("Hi");
        q.add(user);

        System.out.println(q.size());
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.size());




    }
}
