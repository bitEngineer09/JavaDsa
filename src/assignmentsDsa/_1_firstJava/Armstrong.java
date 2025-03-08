package assignmentsDsa._1_firstJava;

public class Armstrong {
    public static void main(String[] args) {
        boolean check1 = armstrong(153);
        System.out.println(check1);
    }

    static boolean armstrong(int number) {

        int original = number;
        int sum = 0;

        while (number > 0) {
            int rem = number % 10;
            sum += (rem * rem * rem);
            number /= 10;
        }
        return original == sum;
    }
}
