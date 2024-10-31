package Streams;

import mergeSort.Sorter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Client {

    public static void main(String[] args) {
        List<Integer> list  = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(6);
        list.add(3);

        //list.stream();
        // This is simply like attaching a pipe to a data source for the data to stream.


        //Intermediate methods: can be chained with one another to perform asynchronous operation
        //Terminal methods: is a final method to terminate the stream.

        example7();
    }

    public static void example1() {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(6);
        list.add(5);
        list.add(4);

//        for(int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

        list
                .stream()
                .forEach((ele) -> {
                    System.out.println(ele);
                });
    }

    public static void example2(){
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(6);
        list.add(5);
        list.add(4);

        list
                .stream()
                .forEach((ele) -> {
                    System.out.println(ele *ele);
                });
    }

    public static void example3(){
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(6);
        list.add(5);
        list.add(4);

        list
                .stream()
                .filter((ele) ->{
                    if(ele%2==0){
                        return true;
                    }
                    return false;
                }).map((ele) -> ele*ele)
                .forEach((ele) -> {
                    System.out.println(ele);
                });
    }

    public static void example4(){
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(6);
        list.add(5);
        list.add(4);

        list
                .stream()
                .map((ele) -> {
                    return ele*ele;
                })
                .forEach((ele) -> {
                    System.out.println(ele);
                });
    }

    public static void example5(){
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(6);
        list.add(5);
        list.add(4);

        Integer finalSum = list
                .stream()
                .reduce(0, (sum, element) -> {
                    return sum+=element;
                });
        System.out.println(finalSum);
    }

    public static void example6(){
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(6);
        list.add(5);
        list.add(4);

        List<Integer> sortedList = list
                .stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedList);
        System.out.println(list);
    }

    public static void example7(){
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(6);
        list.add(5);
        list.add(4);

        Optional<Integer> optionalI = list
                .stream()
                .map((ele) -> {
                    System.out.println(ele);
                    return ele*ele;
                })
                .findFirst();
        //when there is a findfirst, it ommits the remaming operations as the first is the only value required.

        System.out.println(optionalI.get());
    }






}
