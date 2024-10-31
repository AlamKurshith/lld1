package semaphores;

import java.util.Objects;
import java.util.Queue;

public class Consumer implements Runnable{

    private Queue<Objects> queue;

    public Consumer(Queue q){
        this.queue = q;
    }
    @Override
    public void run() {
        while(true){
            synchronized (queue){
                if(queue.size()>0){
                    System.out.println("Consuming...");
                    queue.remove();
                }
            }
        }

    }
}
