package threads;

public class Client {

    public static void main(String[] args){
        System.out.println("Thread ID is : " + Thread.currentThread().getId() +
                " Thread Name is: " + Thread.currentThread().getName()
        );
    }

    public static void print(){
        System.out.println("Printing from a thread: " +
                Thread.currentThread().getName());
    }
}
