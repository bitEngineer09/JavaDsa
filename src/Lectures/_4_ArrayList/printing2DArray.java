package Lectures._4_ArrayList;

import java.util.Arrays;

public class printing2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5},
                {7,5,3,7}
        };

        for(int[] elements : arr) {
            System.out.println(Arrays.toString(elements) + ",");
        }
    }
}
