package syntax_java.oop_java;

import java.util.*;

class slave {
    private String name;
    private int old;

    public static int count_slave = 0;

    public slave(String name, int old) {
        this.name = name;
        this.old = old;
        count_slave++;
    }

    public slave() {
        count_slave++;
    }
    //

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public static int getCount_slave() {
        return count_slave;
    }

    public static void setCount_slave(int count_slave) {
        slave.count_slave = count_slave;
    }

}

public class slave_main {

    public static int max(int a, int b) {
        return a >= b ? a : b;
    }

    public static void sum(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        slave so1 = new slave();
        slave so2 = new slave("Kien", 23);
        System.err.println(slave.count_slave);
        System.err.println("ten no le: " + so2.getName());
        // int a = 5, b = 6;
        // System.err.println(max(a, b));
        System.err.println("slave " + so2.getName() + " chao dai ca!");
        sum(100, 299);
    }
}
