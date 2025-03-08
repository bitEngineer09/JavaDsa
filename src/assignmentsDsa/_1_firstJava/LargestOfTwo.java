package assignmentsDsa._1_firstJava;
// Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class LargestOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers -> ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        largest(x, y);
    }

    static void largest(double a, double b) {
        if (a > b) {
            System.out.println(a + " is largest.");
        }
        else {
            System.out.println(b + " is largest.");
        }
    }
}
