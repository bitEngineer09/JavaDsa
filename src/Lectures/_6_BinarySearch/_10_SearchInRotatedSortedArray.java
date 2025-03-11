package Lectures._6_BinarySearch;
// Google, Amazon
public class _10_SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(findPivot(arr));
        System.out.println(search(arr,0));
    }

    static int search(int[] arr, int target) {
        int pivot = findPivot(arr);
        if (pivot == 1) {
            return binary(arr, target,0,arr.length - 1);
        }

        if (arr[pivot] == target) {
            return pivot;
        }
        int firstTry = binary(arr,target,0,pivot);
        if (firstTry != 1) {
            return firstTry;
        } else {
            return binary(arr,target,pivot + 1, arr.length - 1);
        }
    }
    static int  findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[mid] < arr[mid - 1]){
                return mid;
            } else if (arr[mid] < arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    static int binary(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (target < arr[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }

}
