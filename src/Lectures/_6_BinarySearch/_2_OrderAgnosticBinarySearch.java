package Lectures._6_BinarySearch;

public class _2_OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {-41, -20, -10, 12, 34, 65, 78, 90, 210, 340};
        System.out.println(agnosticBinarySearch(arr, 78));
    }


    static int agnosticBinarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        // find whether array is sorted in ascending or descending order
        boolean isAsc = start < end;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) { // ascending case
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            else { // descending case
                    if (target > arr[mid]) {
                        end = mid - 1;
                    }
                    else {
                        start = mid + 1;
                    }
                }
            }
        return -1;
    }
}



