package syntax_java.oop_java;

import java.util.*;

class circle {
    private double radius;

    //
    public circle(double radius) {
        this.radius = radius;
    }

    public circle() {

    }

    //
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

public class cirvle_main {
    public static void main(String[] args) {
        circle x = new circle(213.2);
        System.err.println(x.getRadius());
    }
}
