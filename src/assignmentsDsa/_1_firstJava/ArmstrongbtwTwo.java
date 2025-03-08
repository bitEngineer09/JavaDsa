package assignmentsDsa._1_firstJava;
// To find Armstrong Number between two given number.

import java.util.Scanner;

public class ArmstrongbtwTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter start value: ");
        int a = scanner.nextInt();

        System.out.print("Enter end value: ");
        int b = scanner.nextInt();

        armstrong(a, b);
    }

    static void armstrong (int start, int end) {
        for (int i = start; i <= end; i++) {
            int number = i;
            int sum = 0;

            while (number > 0) {
                int rem = number % 10;
                sum += (rem * rem * rem);
                number /= 10;
            }

            if (sum == i) {
                System.out.println(sum);
            }
        }
    }
}
