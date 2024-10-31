package Revision;

public interface Vehicle {

    void speedup(int increment ); // Abstract method;

    default void applyBreak(){
        System.out.println("Break applied");
    }
}
