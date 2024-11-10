package comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorExample {

    public static void main(String[] args) {

        ArrayList<Student1> arr = new ArrayList<>();
        arr.add(new Student1("Alam", 1));
        arr.add(new Student1("Kurshith", 2));
        arr.add(new Student1("Kurshith Alam", 3));

        Collections.sort(arr, new Comparator<Student1>() {
            @Override
            public int compare(Student1 o1, Student1 o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("Sorted by name: " + arr);
    }
}
