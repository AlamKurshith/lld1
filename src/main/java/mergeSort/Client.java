package mergeSort;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        List<Integer> list = List.of(2,5,1,3,4,6,8,7);
        ExecutorService executorService =
                Executors.newCachedThreadPool();
        // Executor service to make it multi threaded program.


        Sorter sorter = new Sorter(list, executorService);



        Future<List<Integer>> sortedArrayFuture =
                executorService.submit(sorter);
        //submit can return some data, execute is void that is why we are not using it here.

        System.out.println("Doing some other work");
        System.out.println("Doing some more work");

        System.out.println(sortedArrayFuture.get());
    }
}
