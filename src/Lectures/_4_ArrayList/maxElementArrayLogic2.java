public class maxElementArrayLogic2 {
    public static void main(String[] args) {
        int[] arr = {1,2,34,4,5};
        System.out.println(maxEl(arr));

    }
    static int maxEl(int[] arr) {
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < 5; i++){
            if (arr[i] > res){
                res = arr[i];
            }
        }
        return res;
    }
}
