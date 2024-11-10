package comparable;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ComparableExample {

    public static void main(String[] args) {

        ArrayList<Student> arr = new ArrayList<>();
        arr.add(new Student(1, "Alam"));
        arr.add(new Student(2, "Kurshith"));
        arr.add(new Student(3, "Kurshith Alam"));

        Collections.sort(arr);
        System.out.println(arr);
    }
}
