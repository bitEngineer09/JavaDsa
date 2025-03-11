package Lectures._6_BinarySearch;

public class _9_FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,67,56,45,34,24,1};
        System.out.println(SearchInMountain(arr,67));
    }

    static int SearchInMountain(int[] arr, int target) {
        int peakIndex = searchPeakIndex(arr);
        int firstTry = orderAgnosticBS(arr, target,0, peakIndex);
        if (firstTry != -1) {
            // if ans is found then return the ans -> -1 ke equal nahi aya hai it means ki ans aya hai.
            return firstTry;
        }
            // search in second half
            return orderAgnosticBS(arr, target,peakIndex + 1, arr.length - 1);
    }

    static int searchPeakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // potential ans
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if(target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
