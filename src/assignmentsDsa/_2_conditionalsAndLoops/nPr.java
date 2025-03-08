package assignmentsDsa._2_conditionalsAndLoops;

import java.util.Scanner;

public class nPr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r = scanner.nextInt();
        int diffOfn$r = n - r;

        int check1 = permutation(n, diffOfn$r);
        System.out.println(check1);
    }

    static int factorial (int a) {
        int res = 1;
        for (int i = a; i > 0; i--) {
            res *= i;
        }
        return res;
    }

    static int permutation(int x, int y) {
        int result = factorial(x) / factorial(y);
        return result;
    }
}
