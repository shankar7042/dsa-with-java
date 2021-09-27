// https://leetcode.com/problems/richest-customer-wealth/
package arrays;

import java.util.Arrays;

public class MaximumWealth {
    public static void main(String[] args) {
        int arr[][] = { { 1, 5 }, { 7, 3 }, { 3, 5 } };
        int ans = maximumWealth2(arr);
        // for (int a[] : arr) {
        // for (int val : a) {
        // System.out.print(val + " ");
        // }
        // System.out.println();
        // }
        System.out.println(ans);
    }

    public static int maximumWealth(int[][] accounts) {
        int ans = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }

    public static int maximumWealth2(int[][] accounts) {
        return Arrays.stream(accounts).mapToInt(customerAccount -> Arrays.stream(customerAccount).sum()).max()
                .getAsInt();
    }
}
