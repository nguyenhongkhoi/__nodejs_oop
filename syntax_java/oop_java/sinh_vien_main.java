package syntax_java.oop_java;

import java.util.*;

class svien {
    private String name;
    private int gpa;
    private int mssv;

    //
    public svien() {

    }

    public svien(String name, int gpa, int mssv) {
        this.name = name;
        this.gpa = gpa;
        this.mssv = mssv;
    }

    //
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public int getMssv() {
        return mssv;
    }

    public void setMssv(int mssv) {
        this.mssv = mssv;
    }

    //
    public void show() {
        System.err.println("name = " + name);
        System.err.println("gpa = " + gpa);
        System.err.println("mssv = " + mssv);
    }
}

public class sinh_vien_main {
    public static void main(String[] args) {
        svien sv1 = new svien();
        sv1.setName("maku");
        String a = sv1.getName();
        System.err.println(a);
    }
}
