package syntax_java.oop_java;

import java.util.Scanner;

class Student {
    private String name;
    private char gender;

    public Student(String name, char gender) {
        this.name = name;
        this.gender = gender;
    }

    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    //

    public void display() {
        System.err.println("name = " + name);
        System.err.println("gender = " + gender);
    }

}

public class student_main {
    public static void main(String[] args) {

        Student sb1 = new Student();
        sb1.setName("khoi");
        System.out.println(sb1.getName());

    }
}