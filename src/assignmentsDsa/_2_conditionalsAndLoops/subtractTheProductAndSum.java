package assignmentsDsa._2_conditionalsAndLoops;
// Subtract the Product and Sum of Digits of an Integer

import java.util.Scanner;

public class subtractTheProductAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int check1 = SubtractProductAndSum(n);
        System.out.println(check1);
    }

    static int SubtractProductAndSum(int number) {
        int sum = 0;
        int pro = 1;
        while (number > 0) {
            int rem = number % 10;
            sum += rem;
            pro *= rem;
            number /= 10;
        }
        return pro - sum;
    }
}
