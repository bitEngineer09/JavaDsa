package assignmentsDsa._1_firstJava.fibonacci;

public class Fibnocci2 {
    public static void main(String[] args) {
        fib(34);
    }
    static void fib(int maxValue) {

        int a = 0;
        int b = 1;
        int sum = 0;

        while (sum <= maxValue) {
            System.out.println(sum);
            a = b;
            b = sum;
            sum = a + b;
        }
//        System.out.println(sum);
    }
}
