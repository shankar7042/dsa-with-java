// https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
package arrays;

public class OddCells {
    public static void main(String[] args) {
        int indices[][] = { { 0, 1 }, { 1, 1 } };
        System.out.println(oddCells(2, 3, indices));
        System.out.println(oddCells(2, 2, indices));
    }

    public static int oddCells(int m, int n, int[][] indices) {
        int row[] = new int[m], col[] = new int[n];
        for (int[] idx : indices) {
            row[idx[0]]++;
            col[idx[1]]++;
        }
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((row[i] + col[j]) % 2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
