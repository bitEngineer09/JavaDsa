package Lectures._5_LinearSearch;

// https://leetcode.com/problems/richest-customer-wealth/submissions/1567210912/

public class _9_RichestCustomerWealth {
    public static void main(String[] args) {

        int[][] arr = {
                {1,3},
                {3,7},
//                {7,8,9}
        };

        System.out.println(maxWealth(arr));

    }

    static int maxWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int[] arr : accounts) {
            // when you start a new col, take a new sum for that row
            int rowSum = 0;
            for (int num: arr) {
                rowSum += num;
            }

            // now we have sum of accounts of person
            // check with overall ans
            if (rowSum > ans) {
                ans = rowSum;
            }
        }

//        for (int i = 0; i < accounts.length; i++) {
//            for (int j = 0; j < accounts[i].length; j++) {
//                rowSum += accounts[i][j];
//            }
//
//            if (rowSum > ans) {
//                ans = rowSum;
//            }
//        }
        return ans;
    }
}
