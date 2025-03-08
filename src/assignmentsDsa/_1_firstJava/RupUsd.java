package assignmentsDsa._1_firstJava;

//Input currency in rupees and output in USD.

public class RupUsd {
    public static void main(String[] args) {
        double check1 = convert(200);
        System.out.println(check1);
    }

    static double convert (double rupees) {
        double dollars = rupees / 86.79;
        return dollars;
    }

}
