package Lectures._5_LinearSearch;

public class _8_EvenDigits {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int[] arr = {1,22,356,-4235,-743495,6};
        int evens = evens(arr);
        System.out.println("Number of even digits numbers are: " + evens);
        long endTime = System.currentTimeMillis();

        System.out.println("Total Time Taken: " + (endTime - startTime) + " ms");
    }

    static int evens(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (evenCheck(arr[i])) {
                count++;
            }
        }
        return count;
    }
    // function to check whether a number is even or not
    static boolean evenCheck(int x) {
        int count = 0;
        while (x > 0) {
            int rem = x % 10;
            count++;
            x /= 10;
        }
        return count % 2 == 0;
    }


//---------------Length nikaal ke bhi akr sakte hai---------------------------

//    static int lengthOfnumber(String number) {
//        int digits = number.length();
//        return digits;
//    }
}
