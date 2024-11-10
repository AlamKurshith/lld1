package comparable;

public class Student1 {

    private String name;
    private int grade;

    public int getGrade(){
        return grade;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return name + " : " + grade;
    }

    public Student1(String name, int grade){
        this.name = name;
        this.grade = grade;
    }
    
}
