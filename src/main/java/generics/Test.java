package generics;

import java.util.List;

public class Test {

    public void doSomething(List<Animal> l){
        System.out.println(l);
    }

    public <T extends Animal> void doSomething2(List<T> animals){
        System.out.println(animals);

    }

//    public <T extends Animal>void doSomething3(List<T> animals){
//        for( Animal a: animals){
//            System.out.println(a);
//        }
//    }
    public void doSomething3(List<? extends Animal> animals){
        for( Animal a: animals){
            System.out.println(a);
        }
    }
}
