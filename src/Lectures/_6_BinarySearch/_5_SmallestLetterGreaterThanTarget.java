package Lectures._6_BinarySearch;

// NOTE -> the letters are wrap around: It means
//       * if there is no character in array, that is larger than the target, then return first element.
public class _5_SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] arr = {'a', 'c', 'g', 'p', 's'};
        System.out.println(Ceil(arr, 'u'));
    }

    static int Ceil(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;
//        if (target > arr[arr.length - 1]) {
//            return 0;
//        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return arr[start % arr.length];
    }
}
