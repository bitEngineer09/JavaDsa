import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int row = 7;
        int col = 7;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                // Print '*' at the left and right edges or in the middle row
                if (j == 0 || j == col - 1 || i == row / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}