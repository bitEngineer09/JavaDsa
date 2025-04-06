package Lectures._6_BinarySearch;

// Google
// https://leetcode.com/problems/split-array-largest-sum/description/

public class _12_SplitArrayLargestSum {
    public static void main(String[] args) {
        final int i = countDigits(356354);
        System.out.println(i);
    }
    public static int countDigits(int n){
        if (n <= 0) {
            return -1;
        }
        int digits = (int) (Math.log10(n) + 1);
        return digits;
    }

}
