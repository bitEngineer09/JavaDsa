package Striver._1_BasicMaths;

import java.util.ArrayList;
import java.util.List;

public class _3_Divisors {
    public static void main(String[] args) {
        divisors(36);
    }

    static void divisors (int num) {
        List<Integer> ls = new ArrayList<>();

        for (int i = 1; i <= Math.sqrt(num); i++) { // Math.sqrt(num) cuz squareRoot ke baad divisors repeat hoti hai
            // 6*6 = true
            // 7*7 = false
            // O(sqrt(n))
            if (num % i == 0) {
                ls.add(i);
                    if (num/i != i) { // duplicates aane se rokega, cuz 6 * 6 = 36 so 6 do baar print nahi hone dega
                        ls.add(num / i);
                }
            }
        }

        // O(n log n): n is number of factors
        ls.sort((a,b) -> a - b);

        // O(log n)
        for (Integer i: ls) {
            System.out.print(i + " ");
        }
    }
}
