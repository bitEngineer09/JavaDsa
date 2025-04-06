package Striver._1_BasicMaths;

public class _5_Gcd_HcfByEuclidean {
    public static void main(String[] args) {
        System.out.println(gcd(12, 24));
    }

    // gcd(a, b) = gcd(a - b, b); where a > b {Euclidean Theoram}
    // instead of this: gcd(a, b) = gcd(a % b, b): where a > b
    static int gcd(int a, int b) {
        while(a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        if (a == 0) {
            return b;
        }
        return a;
    }
}
