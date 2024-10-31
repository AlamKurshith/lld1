package synchIntro;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws InterruptedException{
        Count count = new Count();
        count.val = 0;

        Lock lock = new ReentrantLock();
        //Parent p  = new Child():

        Adder adder = new Adder(count, lock);
        Subtractor subtractor = new Subtractor(count, lock);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtractor);
        t1.start();
        t2.start();

        t1.join();
        t2.join(); //the join method will ensure that the main thread will not proceed until t1 finished, it makes the main thread wait until it finishes.


        System.out.println(count.val);


    }

}

