package Striver._2_Recursion;

public class _1_PrintNameNTimes {
    public static void main(String[] args) {
        print(1, 6);
    }
    static void print(int i, int n) {
        // Base consdition
        if (i > n) {
            return;
        }
        System.out.println("Sonu");
        print(i+1 ,n);
    }
}
