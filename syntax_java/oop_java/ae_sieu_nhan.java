package syntax_java.oop_java;

import java.util.*;

class test {
    public static int x = 100;
}

class math {
    public double pi = 3.14;

    public static int abs(int x) {
        if (x < 0)
            return -x;
        else
            return x;
    }

    public int add(int x, int y) {
        return (x + y);
    }

    public int sub(int x, int y) {
        return (x - y);
    }

}

public class ae_sieu_nhan {
    public static void main(String[] args) {
        test tmp1 = new test();
        tmp1.x = 10000;
        test tmp2 = new test();
        System.err.println(tmp2.x);
        System.err.println(math.abs(-20));
        System.err.println();
    }
}
