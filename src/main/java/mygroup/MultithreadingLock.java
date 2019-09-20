package mygroup;

import com.sun.xml.internal.bind.v2.model.annotation.RuntimeAnnotationReader;
import jdk.nashorn.internal.codegen.CompilerConstants;

import java.util.concurrent.*;

public class MultithreadingLock {
    public static void main(String[] args) throws Exception {
//        ExecutorService es = Executors.newSingleThreadExecutor();
        ExecutorService es = Executors.newFixedThreadPool(3);

//        Counter2 counter2 = new Counter2();
//
//        Runnable r1 = new Count(counter2);
//        Runnable r2 = new Count(counter2);
//        Runnable r3 = new Count(counter2);
////        Thread t1 = new Thread(r1);
////        t1.start();
//
//        es.execute(r1);
//        es.execute(r2);
//        es.execute(r3);
//
//        CountCallable c = new CountCallable();
//        Future<String> future = es.submit(c);
//
//        System.out.println(future.get());

        Runnable r1 = new CountTest();
        Runnable r2 = new CountTest();
        Runnable r3 = new CountTest();

        es.execute(r1);
        es.execute(r2);
        es.execute(r3);

        es.shutdown();
    }
}

class CountTest implements Runnable{

    static int sum2=0;

    @Override
    public void run(){
        this.counter();
    }

    public synchronized static int counter(){
        for(int i=0;i<100000;i++){
            sum2+=1;
        }
        System.out.println(Thread.currentThread().getName()+": "+sum2);
        return sum2;
    }
}

class CountCallable implements Callable<String> {
    @Override
    public String call(){
        System.out.println("callable");
        return "ss";
    }
}

class Count implements Runnable{

    private Counter2 counter2;

    Count(Counter2 counter2) {
        this.counter2=counter2;
    }

    @Override
    public void run(){
        counter2.counter();
    }
}

class Counter2{
    static volatile int sum=0;

    public synchronized static int counter(){

        for(int i=0;i<100000;i++){
            sum+=1;
        }
        System.out.println(Thread.currentThread().getName()+": "+sum);
        return sum;
    }
}
