package mygroup;

//https://blog.csdn.net/xiaokang123456kao/article/details/77331878

public class MultithreadingPrintABC implements Runnable {
    private String string;
    Object current;
    Object next;

    MultithreadingPrintABC(String string,Object current,Object next){
        this.string = string;
        this.current = current;
        this.next = next;
    }

    @Override
    public void run(){

        synchronized (current) {
            for (int i = 0; i < 10; i++) {
                System.out.print(string);

                synchronized (next){
                    next.notify();
                }

                try {
                  if(i<9)  current.wait();
                }
                catch (Exception e){
                    System.out.print(e.getMessage());
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Object a = new Object();
        Object b = new Object();
        Object c = new Object();
        Runnable r1=new MultithreadingPrintABC("a",a,b);
        Runnable r2=new MultithreadingPrintABC("b",b,c);
        Runnable r3=new MultithreadingPrintABC("c",c,a);

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);

        t1.start();
        Thread.sleep(100);
        t2.start();
        Thread.sleep(100);
        t3.start();

    }
}

