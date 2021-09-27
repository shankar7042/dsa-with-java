// https://leetcode.com/problems/reshape-the-matrix/

import java.util.*;

public class MatrixReshape {
	public static void main(String[] args) {
		int mat[][] = {{1,2, 3},{4,5,6}};
		int r = 3, c = 2;
		System.out.println(Arrays.deepToString(matrixReshape(mat,r,c)));
	}

	public static int[][] matrixReshape(int[][] mat, int r, int c) {
		int n = mat.length, m = mat[0].length;
		if(n*m != r*c)
			return mat;

		int res[][] = new int[r][c], i = 0, j = 0;
		for (int[] row : mat) {
			for (int val : row) {
				if(j == c){
					j = 0;
					i++;
				}
				res[i][j] = val;
				j++;
			}
		}

		return res;
    }
}