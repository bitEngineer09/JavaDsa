package Lectures._4_ArrayList;

public class _7_reverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        reverse(arr);
    }
    static void reverse(int[] arr){
        for (int row = arr.length - 1; row >= 0; row--){
            System.out.print(arr[row] + " ");
        }
    }
}
