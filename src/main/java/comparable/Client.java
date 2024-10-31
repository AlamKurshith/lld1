package comparable;

import java.util.*;

public class Client {

    public static void main(String[] args) {
        PriorityQueue<Car> pq = new PriorityQueue<>();

        pq.add(new Car(1,2,1));

        List<Car> cars = new ArrayList<>();
        cars.add(new Car(12,13,14));
        cars.add(new Car(212,213,214));
        cars.add(new Car(120,130,104));
        Collections.sort(cars, new mileageComparator());
        System.out.println(cars);




    }
}
