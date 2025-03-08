
public class patterns {
    public static void main(String[] args) {
        pattern1(5);
        pattern2(5);
        pattern3(5);
//        pattern4(5);
//        pattern6(5);
        }
    static void pattern1(int x){
        for (int i = 1; i <= x; i++){
            for (int j = 1; j <= x; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern2(int x){
        for (int i = 1; i <= x; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3(int x){
        for (int i = 1; i <= x; i++){
            for (int j = 5; j > i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern4(int x){
        for (int i = 1; i <= x; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pattern5(int x){
        for (int i = 1; i <= x; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pattern6(int x){
        int row;
        for (row = 1; row <= 2*x-1; row++){
            int totalColsInEachRow = row > x ? 2 * x - row : row;
            for (int col = 1; col <= totalColsInEachRow; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
