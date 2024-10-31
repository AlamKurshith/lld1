package JoinsInThread;

public class ThreadJoining extends Thread{

    @Override
    public void run(){
        for(int i=0; i<2; i++){
            try{
                Thread.sleep(500);
                System.out.println("Current thread: " + Thread.currentThread().getName());
            }
            catch (Exception e){
                System.out.println("Exception has been caught : " + e);
            }
            System.out.println(i);
        }
    }
}
