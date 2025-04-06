package Lectures._5_LinearSearch;

import java.util.Arrays;

public class _4_searchInString2 {
    public static void main(String[] args) {

        String a = "apple";
        final boolean check = StringSearch(a, 'p');
        System.out.println(check);
        System.out.println(Arrays.toString(a.toCharArray()));

    }

    static boolean StringSearch(String str, char target) {

        if (str.length() == 0) {
            return false;
        }

//        forEach is not directly applicable on String.
        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }
}
