package JoinsInThread;

public class Client {

    public static void main(String[] args) {

        ThreadJoining t1 = new ThreadJoining();
        ThreadJoining t2 = new ThreadJoining();
        ThreadJoining t3 = new ThreadJoining();

        t1.start();
        try{
            System.out.println("Current thread: " + Thread.currentThread().getName());
            t1.join();
        }
        catch (Exception e ){
            System.out.println("Exception has been caught : " + e);

        }

        t2.start();

        try{
            System.out.println("Current Thread: " + Thread.currentThread().getName());
            t2.join();
        }
        catch (Exception e){
            System.out.println("Exception has been caught: " + e);
        }

        t3.start();
        try{
            System.out.println("Current thread : " + Thread.currentThread().getName());
            t3.join();
        }
        catch (Exception e){
            System.out.println("Exception has been caught " + e);
        }
    }
}
