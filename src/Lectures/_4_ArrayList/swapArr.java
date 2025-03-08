import java.util.Arrays;
import java.util.Scanner;

public class swapArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        swapArray(arr, 2, 4);
        System.out.println(Arrays.toString(arr));
    }
    static void swapArray(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
