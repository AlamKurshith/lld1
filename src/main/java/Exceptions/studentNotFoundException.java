package Exceptions;

public class studentNotFoundException extends RuntimeException{

    //Runtime exceptions is for unchecked exceptions
    //Exception is for checked exception

    public studentNotFoundException(String message){
        super(message);
    }
}
