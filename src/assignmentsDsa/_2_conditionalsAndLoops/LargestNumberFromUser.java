package assignmentsDsa._2_conditionalsAndLoops;
// Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;

public class LargestNumberFromUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        System.out.print("Enter 0 to exit: ");
        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            if (number > max) {
                max = number;
            }
        }
        System.out.println("The largest number among all is: " + max);
    }
}
