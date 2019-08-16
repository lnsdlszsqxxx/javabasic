package mygroup;

public class ThreadTest extends Thread {

    @Override
    public void run(){
        Counter counter = new Counter();
        counter.getCount();
    }

    public static void main(String [] args){

        Thread t0 = new ThreadTest();
        Thread t1 = new ThreadTest();
        Thread t2 = new ThreadTest();
        Thread t3 = new ThreadTest();
        Thread t4 = new ThreadTest();
        Thread t5 = new ThreadTest();
        Thread t6 = new ThreadTest();
        Thread t7 = new ThreadTest();
        Thread t8 = new ThreadTest();
        Thread t9 = new ThreadTest();
        Thread t10 = new ThreadTest();

        t0.start();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();

    }
}

class Counter{

    private static int count=0;

    public int getCount(){
        count += 1;

        System.out.println(Thread.currentThread().getName()+": The current number is "+ count);
        return  count;
    }

}


