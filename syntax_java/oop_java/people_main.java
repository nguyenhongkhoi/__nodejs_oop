package syntax_java.oop_java;

import java.util.*;

class people{
    private String name;
    private int age;

//getter setter constructer
    public people(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    //
    public void show(){
        System.err.println("name = " + name);
        System.err.println("age = " + age);
    }   
    public boolean 



}

public class people_main {
    public static void main(String[] args) {

    }
}
