package assignmentsDsa._1_firstJava;
// Write a program to print whether a number is even or odd,
// also take input from the user.

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean check = EveOdd(number);
        System.out.println(check);
    }
    static boolean EveOdd(int num) {
//        if (num % 2 == 0) {
//            return true;
//        }
//        else{
//            return false;
//        }
        return num % 2 == 0;
    }
}
