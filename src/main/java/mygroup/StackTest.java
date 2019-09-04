package mygroup;

import java.util.Stack;

public class StackTest {

    public static void main(String[] args) {

        User user=new User();
        user.setName("Liang");
        user.setId(1);
        user.setAge(33);

        Stack s=new Stack();
        s.push("A");
        s.push(2L);
        s.push(user);
        System.out.println(s.peek());
        System.out.println(s.search("A"));


        System.out.println(s.size());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.size());

        System.out.println(s.peek());

    }
}
