package assignmentsDsa._1_firstJava;
//  Write a program to input principal, time, and rate (P, T, R) from
//  the user and find Simple Interest.

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double princpal = sc.nextDouble();

        System.out.print("Enter rate of interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter time in years: ");
        int time = sc.nextInt();

        double amt1 = intrst(princpal, rate, time);
        System.out.println(amt1);

    }
    static double intrst(double p, double r, int t) {
        double interest = (p * r * t) / 100;
        return interest;
    }
}
