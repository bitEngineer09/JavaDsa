package assignmentsDsa._2_conditionalsAndLoops;
// Take integer inputs till the user enters 0 and print the sum of all numbers

import java.util.Scanner;

public class SumOfUserInputNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int res = 0;
        System.out.println("Enter inputs and press 0 to exit.");

        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            res += number;
        }
        System.out.println("sum of numbers is "+ res);
    }


}
