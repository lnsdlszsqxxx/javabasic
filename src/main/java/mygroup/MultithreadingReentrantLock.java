package mygroup;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static java.lang.Thread.sleep;

public class MultithreadingReentrantLock {
    public static void main(String[] args) throws InterruptedException {
        ReentrantLock lock = new ReentrantLock();
        Condition conditionA = lock.newCondition();
        Condition conditionB = lock.newCondition();
        Condition conditionC = lock.newCondition();

        Runnable r1 = new Thread2(lock, conditionA, conditionB, 'A');
        Runnable r2 = new Thread2(lock, conditionB, conditionC, 'B');
        Runnable r3 = new Thread2(lock, conditionC, conditionA, 'C');

        ExecutorService es = Executors.newFixedThreadPool(3);
        es.submit(r1);
        sleep(100);
        es.submit(r2);
        sleep(100);
        es.submit(r3);

        es.shutdown();


    }
}

class Thread2 implements Runnable{
    ReentrantLock lock = new ReentrantLock();
    Condition conditionCurrent;
    Condition conditionNext;
    char aChar;

    Thread2(ReentrantLock lock, Condition conditionCurrent, Condition conditionNext, char aChar){
        this.lock = lock;
        this.conditionCurrent = conditionCurrent;
        this.conditionNext = conditionNext;
        this.aChar = aChar;
    }


    @Override
    public void run(){
        lock.lock();
        try{
            for(int i=0;i<10;i++){
                System.out.print(aChar);
                conditionNext.signal();

                if(i<9) {
                    try {
                        conditionCurrent.await();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
            }

        }
        finally {
            lock.unlock();
        }
    }

}
