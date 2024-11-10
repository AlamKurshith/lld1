package Streams;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableExample {

    public static void main(String[] args) {


        Runnable task = () -> {
            System.out.println("Running via runnable");
        };

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(task);
        executorService.shutdown();
    }
}
