package syntax_java.oop_java;

import java.util.*;

class Person {
    private String name;
    private String gender;

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
    }
}

class Student extends Person {
    private int salary;

    public Student(String name, String gender, int salary) {
        super(name, gender);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void display() {
        super.display();
        System.out.println("Salary: " + salary);
    }

}
@Service
public class people_main {
    public static void sum(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        Student s = new Student("Trung", "Male", 1700);
        s.display();
        System.out.println("sadd");
        sum(100, 20);
    }

}