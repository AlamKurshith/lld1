package generics;

public class Pair<T,S>{

    // T and S are place-holders, they are not data types.

     private T first;
     private S second;

     private String name;

     public void setFirst(T first){
         this.first = first;
     }

     public void setSecond(S second){
         this.second = second;
     }

     public T getFirst(){
         return first;
     }
     public S getSecond(){
         return second;
     }

     public String getName(){
         return name;
     }

     // Static method cannot access instance object
     // Because static can be accessed without creating an object
    // public static void doSomething(T name){
    //Solution: Create generic at method level
    public static <V> V doSomething(V name){
         //<V> is a place-holder for the return type.
        // V is the return type.
        System.out.println(name);
        return name;
    }


     }

