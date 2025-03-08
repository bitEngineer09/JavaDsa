package assignmentsDsa._2_conditionalsAndLoops;
// Input a number and print all the factors of that number

public class FactorsOfNumber {
    public static void main(String[] args) {
        factors(20);
    }

    static void factors(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
