package syntax_java.oop_java;

import java.util.Scanner;

class student {
    String name;
    int age;

    public void show() {
        System.err.println("name = " + name);
        System.err.println("age = " + age);
    }

    public void scan() {
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        age = sc.nextInt();
        // sc.close();
    }
}

public class student_main {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            student st = new student();
            st.scan();
            st.show();
        }

    }
}
