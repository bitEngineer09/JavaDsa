package Striver._2_Recursion;

public class _5_Factorial {
    public static void main(String[] args) {
        final int facorial = facorial(5);
        System.out.println(facorial);
    }
    static int facorial(int N) {
        if(N == 1) {
            return 1;
        }
        return N * facorial(N-1);
    }
}
