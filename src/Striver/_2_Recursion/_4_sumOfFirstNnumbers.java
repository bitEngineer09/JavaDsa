package Striver._2_Recursion;

public class _4_sumOfFirstNnumbers {
    public static void main(String[] args) {
//        sum(5,0);
        System.out.println(sumFun(5));
    }

    // parameterized way
//    static void sum(int N, int sum) {
//        {
//            if (N < 1) {
//                System.out.println(sum);
//                return;
//            }
//            sum += N;
//            sum(N-1,sum);
//        }
//    }

    // functional way
    static int sumFun(int N) {
        if (N == 0) {
            return 0; // this will be returned to its calling function
        }
        return N + sumFun(N - 1);
    }
}

