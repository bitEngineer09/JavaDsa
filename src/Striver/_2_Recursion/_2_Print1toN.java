package Striver._2_Recursion;

public class _2_Print1toN {
    public static void main(String[] args) {
        print(1, 10);
        System.out.println();
        printReverse(10);
    }

    static void print(int i,int n) {
        if (i > n) {
            return;
        }
        System.out.print(i + " ");
        print(i+1, n);
    }
//---------------Reverse----------------------
    static void printReverse(int i) {
        if (i < 1) {
            return;
        }
        System.out.print(i + " ");
        printReverse(i-1);
    }
}
