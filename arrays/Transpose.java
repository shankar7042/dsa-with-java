// https://leetcode.com/problems/transpose-matrix/
package arrays;

public class Transpose {
    public static void main(String[] args) {
        int mat[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
        int res[][] = transpose(mat);
        for (int i[] : res) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

    public static int[][] transpose(int[][] matrix) {
        int res[][] = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                res[j][i] = matrix[i][j];
            }
        }

        return res;
    }
}