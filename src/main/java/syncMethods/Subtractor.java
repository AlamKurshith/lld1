package syncMethods;

public class Subtractor implements Runnable{

    private Count count;

    public Subtractor(Count c){
        this.count = c;
    }

    @Override
    public void run(){
        for(int i=1; i<=1000; i++) {
            count.incrementValue(-i);
        }
    }
}
