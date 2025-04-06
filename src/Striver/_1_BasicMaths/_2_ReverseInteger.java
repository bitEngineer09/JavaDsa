package Striver._1_BasicMaths;
// **** ek condn reh ri hai jisme 0 print nahi hona chahiye

public class _2_ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(456234));
    }
    static int reverse(int x) {
        int rev = 0;
        while (x != 0) {  // x < 0 me negative values ke liye kaam nahi karega. So take x != 0
            int rem = (x) % 10;  // last digit nikla

            // overflow check
            // if (rev * 10) > Integer.MAX_VALUE -> 10 ko divide me daal do
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0; // if overflow, return 0
            }

            rev = (rev * 10) + rem;
            x /= 10;
        }
        return rev;
    }
}
