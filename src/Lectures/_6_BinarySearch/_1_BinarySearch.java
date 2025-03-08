package Lectures._6_BinarySearch;

public class _1_BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-20,-10,2,3,15,16,18,30,35,60};
        final int i = binarySearch(arr, 0);
        System.out.println(i);

    }

    // return index
    // return -1 if not exists
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might exceeds the int range
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            }
            else if (target < mid) {
                end = mid - 1;
            }
            else {
                // ans found
                return mid;  // agar while loop ne yaha kuch return nahi kiya, it means element not found
            }
        }
        return -1;
    }
}
