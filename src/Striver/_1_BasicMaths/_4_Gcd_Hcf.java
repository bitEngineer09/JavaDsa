package Striver._1_BasicMaths;

public class _4_Gcd_Hcf {
    public static void main(String[] args) {
        System.out.println(hcf( 11, 24));
    }
    static int hcf(int num1, int num2) {
//        int minNum;
//        if (num1 < num2) {
//            minNum = num1;
//        } else {
//            minNum = num2;
//        }
        int minNum = Math.min(num1, num2);

        int gcd = 0;
        for(int i = 1; i <= minNum; i++) {
            if (num1 % i == 0 && num2 % i ==0) {
                gcd = i;
            }
        }
        return gcd;
    }
}

// this approach gets failed on combination of large and small number
//        if (num1 < num2) {
//            upto = (int) Math.sqrt(num1);
//        }
//        else {
//            upto = (int) Math.sqrt(num2);
//        }
