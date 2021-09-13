// https://leetcode.com/problems/matrix-diagonal-sum/
package arrays;

public class DiagonalSum {
    public static void main(String[] args) {
        int mat[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println(diagonalSum(mat));
    }

    public static int diagonalSum(int[][] mat) {
        int ans = 0, n = mat.length;

        for (int i = 0; i < n; i++) {
            ans += mat[i][i];
            ans += mat[i][n - i - 1];
        }
        if (n % 2 != 0)
            ans -= mat[n / 2][n / 2];
        return ans;
    }
}
