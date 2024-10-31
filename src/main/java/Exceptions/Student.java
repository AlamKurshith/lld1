package Exceptions;

import generics.Pair;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.rmi.StubNotFoundException;
import java.sql.SQLException;

public class Student {

    public int doSomething(){
        int a = 1;
        int b = 0;
        return a/b;
    }

    public void doSomething2() {

        String s =getStringFromAPI();
        if(s!=null){
            System.out.println(s.length());
        }
    }

    public void doSomething3(String fileName){
        try{
            File file = new File(fileName);
            FileReader fileReader = new FileReader(file);
        } catch (IOException e){
            System.out.println("Error! file not found");
        }
    }

    //Java allows us to have multiple catch block
    //If the exceptions are unrelated( They are not part of the parent-child hierarchy)
    //If they are related then the more specific class has to come first, then the general ones.
    public void doSomething4(String fileName){
        try{
            File file = new File(fileName);
            FileReader fileReader = new FileReader(file);

            if(true){
                throw new SQLException();
            }
            else if(true){
                throw new IOException();
            }
        }
        catch (FileNotFoundException ex){
            System.out.println("File not found exception");
        }
        catch (SQLException ex){
            System.out.println("Data base not found");
        }
        catch (IOException e){
            System.out.println("Something went wrong IO");
        }
        catch (Exception e){
            System.out.println("Try again");
        }

        System.out.println("Printing normally after exception");
    }

    public void doSomething6(){
        try{
            if(true){
                throw new SQLException();
            }
        } catch(SQLException e){
            System.out.println("Exception of database");
        }
        finally{
            System.out.println("I will anyway be printed");
            //Finally block is used to clean-up resource
            // End the connection, close the file, etc,.
        }
    }
    public String getStringFromAPI(){
        return null;
    }
    public void readFile(String fileName){
        try{
            File file = new File(fileName);
            FileReader fileReader = new FileReader(file);

            System.out.println("Printing after exception from try");
            //This will not be printed since the exception has occured.
        } catch (FileNotFoundException ex){
            System.out.println("File not found.");
        }
        System.out.println("Printing after exception from main");
    }

    public void readFile2(String fileName) throws FileNotFoundException{
        //throws is way of making it someone else's problem.
        File file = new File(fileName);
        FileReader fileReader = new FileReader(file);
    }

    public Student findStudentId(int id) throws studentNotFoundException{

        return null;

    }
}
