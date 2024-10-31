package comparable;

public class Car implements Comparable{

    public int topSpeed;
    public int acceleration;
    public int mileage;

    public Car( int topSpeed, int acceleration, int mileage){
        this.topSpeed = topSpeed;
        this.acceleration = acceleration;
        this.mileage = mileage;
    }

    public int compareTo(Car o) {
        if(topSpeed > o.topSpeed){
            return 1;
        }
        else if(topSpeed < o.topSpeed){
            return -1;
        }

        return 0;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}


