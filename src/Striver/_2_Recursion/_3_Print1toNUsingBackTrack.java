package Striver._2_Recursion;

public class _3_Print1toNUsingBackTrack {
    public static void main(String[] args) {
        print(5);
    }
    static void print(int i) {
        if (i < 1) {
            return;
        }
        // backtracking before doing work
        print(i-1);
        System.out.println(i);
    }
}
