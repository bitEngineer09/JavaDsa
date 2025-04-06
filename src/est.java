import java.util.Arrays;

public class est {
    public static void main(String[] args) {
    String a = "apple";
//        for (int i = 0; i < a.length(); i++) {
//            System.out.println(a.charAt(i));
//        }
        final int i = linearSearch(a, 'e');
        System.out.println(i);
    }

    static int linearSearch(String a, char target) {
//        for (int i = 0; i < a.length(); i++) {
//            if (a.charAt(i) == target) {
//                return i;
//            }
//        }
//        return -1;

        for (char c : a.toCharArray()) {
            if (c == target) {
                return 1;
            }
        }
        return -1;
    }
}