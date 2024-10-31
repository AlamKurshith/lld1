package synchronizedBlock;

public class Subtractor implements Runnable{

    private Count count;

    public Subtractor(Count c){
        count = c;
    }



    @Override
    public void run() {

        for(int i=1; i<=1000; i++){
            synchronized (count){
                count.val-=i;
            }
        }
    }
}
