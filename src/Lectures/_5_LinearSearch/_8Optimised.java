package Lectures._5_LinearSearch;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

public class _8Optimised {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int[] arr = {1,221,333,4444, 53345345};
        System.out.println(evens(arr));

        long endTime = System.currentTimeMillis();

        System.out.println("Total Time Taken: " + (endTime - startTime) + " ms");
    }

    static int evens(int[] arr) {
        int count = 0;
        for (int num: arr) {
            if (checkEven(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean checkEven(int number) {
        if (number < 0) {
            number *= -1;
        }

        int digits = (int) (Math.log10(number) + 1);  // return number of digits
        return digits % 2 == 0;
    }
}
