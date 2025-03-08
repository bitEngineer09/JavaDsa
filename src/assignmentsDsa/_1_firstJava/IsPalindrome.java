package assignmentsDsa._1_firstJava;
// To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        boolean check1 = isPalindrome(number);
        System.out.println(check1);
    }
    static boolean isPalindrome (int num) {
        int original = num;
        int rev = 0;

        while (num > 0) {
            int rem = num % 10;
            rev = (rev * 10) + rem;
            num /= 10;
        }

        return original == rev;
    }
}
