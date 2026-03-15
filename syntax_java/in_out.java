package syntax_java;

import java.util.Scanner;

public class in_out {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String name = sc.next();
        System.out.print(a + " and " + name);
    }
}
