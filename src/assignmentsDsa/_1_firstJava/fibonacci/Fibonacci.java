package assignmentsDsa._1_firstJava.fibonacci;

//To calculate Fibonacci Series up to n numbers.

public class Fibonacci {
    public static void main(String[] args) {
        fib(7);
    }

    static void fib (int num) {

        int a = 0;
        int b = 1;
        int sum = 0;
        int count = 1;

        while (count <= num) {
            System.out.print(sum + " ");
            a = b;
            b = sum;
            sum = a + b;
            count++;
        }

    }
}
