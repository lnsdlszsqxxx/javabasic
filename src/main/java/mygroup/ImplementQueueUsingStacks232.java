package mygroup;

import java.util.Stack;

public class ImplementQueueUsingStacks232 {
    public static void main(String[] args) {

        MyQueue queue = new MyQueue();

        queue.push(1);
        queue.push(2);

        System.out.println(queue.peek());
        System.out.println(queue.pop());
        System.out.println(queue.empty());
    }


}

class MyQueue {
    Stack<Integer> stack1 = new Stack();
    Stack<Integer> stack2 = new Stack();

    /** Initialize your data structure here. */
    public MyQueue() {

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stack1.push(x);

    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }

        int output = stack2.pop();

        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }

        return output;
    }

    /** Get the front element. */
    public int peek() {
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }

        int output = stack2.peek();

        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }

        return output;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack1.isEmpty();
    }
}
