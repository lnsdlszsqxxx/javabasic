package mygroup;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class MultithreadThreeWays{

    public static void main(String[] args) throws Exception{

        List<Integer> x=new ArrayList<>();

        Thread t1 = new Thread1("hello");
        t1.setDaemon(false);
//        t1.start();

        ThreadRunnable r2 = new ThreadRunnable();
        r2.setS("Haha");
        Thread t2 = new Thread(r2, "Wang");
//        t2.setName("Liang");
//        t2.start();

        ThreadCallable c3 = new ThreadCallable("My String");
        ExecutorService es = Executors.newSingleThreadExecutor();

        Future future = es.submit(c3);
        System.out.println(future.get());

        es.execute(t1);
        es.execute(t2);

        es.shutdown();

    }

}

class Thread1 extends Thread{

    public String x;

    public Thread1(String x){
        this.x=x;
    }

    @Override
    public void run(){
        System.out.println("This is from Thread, String is "+x);
    }

}

class ThreadRunnable implements Runnable{

    Thread t;
    String threadName;
    private String s;

    public ThreadRunnable(){
        this.threadName="default_threadName";
    }

    public ThreadRunnable(String threadName){
        this.threadName=threadName;
    }

    public void setS(String s){
        this.s=s;
    }

    @Override
    public void run(){
        System.out.println("This is from Runnable, the String is:"+s+", thread name is "+Thread.currentThread().getName());
    }

    public void start(){

        t = new Thread(this,threadName);
        t.start();
    }
}


//callable has return type
//can throw exception
//overrides call
//we can control the callable thread
class ThreadCallable implements Callable<Integer>{

    public ThreadCallable(String s){
//        System.out.println("This is your String to Callable: "+s);
    }

    @Override
    public Integer call(){
        System.out.println("This is from callable");
        return 33;
    }

}
