package lambda;

import java.util.*;

public class Client {

    public static void main(String[] args) {

        // () -> {} Is just a lambda expression which replaces the whole thing ( Creating a new thread and implementing runnable)
        // Lambdas are valid only for SAM (Single abstract method)
        //Lambdas are anonymous implementation of single abstract method.

        Thread t = new Thread(() -> {
            System.out.println("Hello world from " + Thread.currentThread().getName());
        });

        t.start();

        //Custom comparator

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(2);
        list.add(5);
        list.add(3);
        //Normal custom comparator
//        Collections.sort(list, (Integer i1, Integer i2) -> {
//            if (i1 > i2) {
//                return 1;
//            } else if (i2 > i1) {
//                return -1;
//            }
//            return 0;
//        });

        //Shorten verson of custom comparator

//        Collections.sort(list,  (Integer a, Integer b) -> {
//            return a-b;
//        });

        //Even shorter version: Java will automatically infer the data type
        //Shorten version of lambda expression
//        Collections.sort(list, (a,b) -> {
//            return a-b;
//        });

        //We can further shorten the code if we have only one line

        Collections.sort(list, (a,b)-> a-b
        );


        System.out.println(list);

    }
}
