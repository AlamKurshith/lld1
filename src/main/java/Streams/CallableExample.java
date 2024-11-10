package Streams;

import java.util.concurrent.*;

public class CallableExample {

    public static void main(String[] args) {
        Callable<String> task = ()->{
            return "Running from callable";
        };
        ExecutorService service = Executors.newSingleThreadExecutor();
        Future<String> future = service.submit(task);

        try{
            String result = future.get();
            System.out.println(result);
        }
        catch (InterruptedException | ExecutionException e ){
            e.printStackTrace();
        }
        finally {
            service.shutdown();
        }
    }


}
