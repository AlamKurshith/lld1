package Exceptions;

import java.io.FileNotFoundException;

public class Client {

    public static void main(String[] args)  {
        Student student = new Student();
        student.readFile("abc");

//        try {
//            student.readFile2("123");
//        } catch (FileNotFoundException ex){
//            System.out.println("Printing from main's try-catch block");
//        }

        //student.doSomething2();
        //student.doSomething3("asd");
        // student.doSomething4("ade");
        //student.doSomething6();

//        try{
//            student.findStudentId(2);
//        } catch (studentNotFoundException ex){
//            System.out.println("Student not found");
//        }


        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            String str = null;
            System.out.println(str.length());
            System.out.println("Null Pointer Exception Caught");
        } finally {
            System.out.println("Finally Block");
        }


    }

}






