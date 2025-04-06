package Striver._1_BasicMaths;

public class _1_countDigitsThatDivideNumber {
    public static void main(String[] args) {
        System.out.println(countDigits(23456));
    }
    static int countDigits(int num) {
        int duplicate = num;
        int count = 0;
        while (num != 0) {
            int rem = num % 10;
            if (duplicate % rem == 0) {
                count++;
            }
            num /= 10;
        }
        return count;
    }
}
