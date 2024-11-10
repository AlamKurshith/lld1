package comparable;

public class Student implements Comparable<Student>{

    private int grade;
    private String name;

    public int getGrade(){
        return grade;
    }

    public String getName(){
        return name;
    }

    public Student(int grade, String name){
        this.name = name;
        this.grade = grade;
    }

    @Override
    public int compareTo(Student other){
        return Integer.compare(other.grade, this.grade);
    }

    @Override
    public String toString(){

        return name + " : " + grade;

    }



}
