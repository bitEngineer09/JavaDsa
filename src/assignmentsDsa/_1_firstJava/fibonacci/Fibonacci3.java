package assignmentsDsa._1_firstJava.fibonacci;

public class Fibonacci3 {
    public static void main(String[] args) {
        fib(7);
    }

    static void fib(int length) {

        int a = 0;
        int b = 1;
        int sum = 0;

        for (int i = 2; i <= length; i++) {
            a = b;
            b = sum;
            sum = a + b;
        }
        System.out.println(sum);
    }
}
