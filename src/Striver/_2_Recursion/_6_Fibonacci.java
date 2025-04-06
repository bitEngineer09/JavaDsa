package Striver._2_Recursion;

public class _6_Fibonacci {
    public static void main(String[] args) {
        final int fib = fib(2);
        System.out.println(fib);
    }
    static int fib(int n) {
        if (n < 2) { // jaise hee 2 se neeche jaaega to 1 hee reh gaya na add karne ke liye
            return n;
        }
        return fib (n - 1) + fib (n - 2);
    }
}
