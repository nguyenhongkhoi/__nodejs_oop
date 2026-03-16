package syntax_java.oop_java;

import java.util.Scanner;

class rectengle {
    private double length;
    private double width;

    public void show() {
        System.err.println(length);
        System.err.println(width);
    }

    public double area() {
        return length + width;
    }

    public void para() {
        System.err.println("parameter = " + (length * width));
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public rectengle(double length, double width) {
        this.length = length;
        this.width = width;
    }

}

public class ractangle_main {
    public static void main(String[] args) {
        rectengle a = new rectengle(122, 212);
        a.show();
        System.err.println(a.area());

    }
}
