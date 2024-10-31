package Revision;

public class Client {

    public static void main(String[] args) {

        Car car = new Car();
        car.speedup(200);
        car.applyBreak();
        Thread t = new Thread(String.valueOf(car));
        t.start();
    }
}
