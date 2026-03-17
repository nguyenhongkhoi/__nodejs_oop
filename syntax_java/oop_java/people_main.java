package syntax_java.oop_java;

import java.util.*;

class people {
    private String name;
    private int age;

    // constructer
    public people() {

    }

    public people(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getter setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //
    public void show() {
        System.err.println("Name: " + name);
        System.err.println("Age: " + age);
    }

    public void scan() {
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        age = sc.nextInt();

    }

}

public class people_main {
    public static void main(String[] args) {
        people x1 = new people();
        people x2 = new people("Kien", 29);
        x1.show();
        x2.show();

        // sc.close();
    }
}
