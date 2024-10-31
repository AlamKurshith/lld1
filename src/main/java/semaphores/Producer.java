package semaphores;

import java.util.Queue;

public class Producer implements Runnable{

    private Queue<Object> queue;

    public Producer(Queue q){
        this.queue = q;
    }

    @Override
    public void run(){
        synchronized (queue){
            while(true){
                if(queue.size()<6){
                    System.out.println("Producing...");
                    queue.add(new Object());
                }
            }
        }
    }
}
