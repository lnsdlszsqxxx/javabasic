package mygroup;

import java.util.stream.IntStream;

import static java.lang.Thread.sleep;

public class MultithreadDaemon {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new ThreadTest1();
        Thread t2 = new ThreadTest1();

        t1.setDaemon(true);
        t2.setDaemon(true);

        t1.start();
        t2.start();

        sleep(65);

        System.out.println("main ended-------------------");
    }
}

class ThreadTest1 extends Thread{
    @Override
    public void run(){
//        IntStream.range(1,50).forEach(System.out::println);
        IntStream.range(1,1000).forEach(i->System.out.println(Thread.currentThread().getName()+": "+i));
    }
}
