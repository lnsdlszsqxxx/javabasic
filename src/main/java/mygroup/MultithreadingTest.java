package mygroup;

public class MultithreadingTest extends Thread {

    @Override
    public void run(){
        Counter counter = new Counter();
        counter.getCount();
    }

    public static void main(String [] args) throws InterruptedException{

        Thread t0 = new MultithreadingTest();
        Thread t1 = new MultithreadingTest();
        Thread t2 = new MultithreadingTest();
        Thread t3 = new MultithreadingTest();
        Thread t4 = new MultithreadingTest();
        Thread t5 = new MultithreadingTest();
        Thread t6 = new MultithreadingTest();
        Thread t7 = new MultithreadingTest();
        Thread t8 = new MultithreadingTest();
        Thread t9 = new MultithreadingTest();
        Thread t10 = new MultithreadingTest();

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


