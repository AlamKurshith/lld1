package executorIntro;

import Print1To100thread.NumberPrinter;

import java.lang.reflect.Executable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {

    //Instead of creating 100 threads to print 100 numbers, we can create soome fixed number of threads and we can re-use it.
    //Executor framework has 2 responsibility: Division of responsibility
    //Efficiently running the app (Starting, finishing, waiting, creating threads...)


    public static void main(String[] args) {

        //Executor executor = Executors.newFixedThreadPool(10);
        //Executor service provide a framework for managing and controlling thread.

        //ExecutorService is Executor with more methods, it allows us to shut down the thread one the tasks are done.
        //ExecutorService executorService = Executors.newFixedThreadPool(10);

        //Cached thread pool is also same as fixed thread pool but it creates a new thread if a new task is coming and all other threads are busy, there is no upper limit to the number of thread to be created.
        ExecutorService executorServiceCachedThreadPool = Executors.newCachedThreadPool();

        for(int i=1; i<=100; i++){
            if(i==2 || i==20){
                System.out.println("DUBUG");
            }
            NumberPrinter np = new NumberPrinter(i);
            executorServiceCachedThreadPool.execute(np);
        }

        executorServiceCachedThreadPool.shutdown();
    }
}
