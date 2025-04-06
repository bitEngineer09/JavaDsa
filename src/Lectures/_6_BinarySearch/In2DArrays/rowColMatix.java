package Lectures._6_BinarySearch.In2DArrays;

import java.util.Arrays;

public class rowColMatix {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {45, 78, 89},
                {101, 201, 304}
        };
        final int[] search = search(arr, 78);
        System.out.println(Arrays.toString(search));
    }

    static int[] search(int[][] matrix, int target) {
        int r = 0;
        int c = matrix.length - 1; // matrix length will be number of rows

        while (r < matrix.length && c > 0) {
            if (matrix[r][c] == target) {
                return new int[]{r, c};
            } else if (matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        return new int[]{-1, -1};
    }
}
