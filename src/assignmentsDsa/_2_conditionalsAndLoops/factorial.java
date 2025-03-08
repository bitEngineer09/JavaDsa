package assignmentsDsa._2_conditionalsAndLoops;
// factorial of a number

public class factorial {
    public static void main(String[] args) {
        int check1 = facto(5);
        System.out.println(check1);
    }
    static int facto(int number) {
        int res = 1;
        for (int i = number; i > 0; i--) {
            res *= i;
        }
        return res;
    }
}
