package Lectures._4_ArrayList;

public class _6_maxElementInRange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(maxElement(arr, 2, 6));
    }
    static int maxElement(int[] arr, int start, int end){

        if (end > start || arr == null || arr.length == 0) { // these are the edge cases.
            return -1;
        }

        int max = arr[start];
        for (int i = start; i <= end; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
