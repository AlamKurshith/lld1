package generics;

import java.util.*;

public class Client {

    public static void main(String[] args) {


        //Pair<String, Integer> p = new Pair<String, Integer>();

//        p.first = "abc";
//        p.second = 123;
        // p.second = "abc"; -> this will have a compile time check.

        //Pair<String, int> p1 = new Pair<String, int>();
        // This will not work bcoz primitives are not allowed inside generics.
        // Only objects are allowed.

//        p.setFirst("abc");
//        p.setSecond(12);
//
//        String i = p.getFirst();
//        int j = p.getSecond();
//
//        List<Integer> list = new ArrayList<>();

        //generics at method level
//        Pair.<String>doSomething("123");
//        String s1 = Pair.doSomething("123");
//        Integer i1 = Pair.doSomething(123);
//
//        ShapeCommand<Shape> shapeCommand1 = new ShapeCommand<>();
//        ShapeCommand<Circle> shapeCommand2 = new ShapeCommand<>();
//
//        shapeCommand1.printShapeName(new Square());
//        ShapeCommand.printShapeName2(new Circle());



        //........

//        Test test = new Test();
//        List<Animal> animalList = new ArrayList<>();
//        test.doSomething(animalList);
//
//        List<Dog> dogList = new ArrayList<>();
        //test.doSomething(dogList);

        // Dog cannot be converted to Animal
        // Animals can be dog.
        // doSomething method will accept only animals object list
        // "List<Animal>" itself is an object, it doesn't matte what's inside it
        ///"List<Animal>" is simply not matching with "List<Dog>"
//
//        List<Dog> d = new ArrayList<>();
//        test.doSomething2(d);



        //..........


        //Type erasure
//        List list2 = new ArrayList();
//        Pair p3 = new Pair();

        // java remove the types from generics at runtime.

        // This is how all the codes will be converted at runtime
        // This is for backward compatability


        //.............

        //Ceollections

        Set<String> set = new HashSet<>();
        // order is not maintained

        Set<String> set1 = new LinkedHashSet<>();
        //order is maintained

        Set<String> set2 = new TreeSet<>();
        //order is maintained here also.

        set1.add("Alam");
        set1.add("Blm");
        set1.add("Crf");
        set1.add("Dwarfer");

        System.out.println(set1);










    }
}
