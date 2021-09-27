// https://leetcode.com/problems/lucky-numbers-in-a-matrix/

import java.util.*;

public class LuckyNumbers {
	public static void main(String[] args) {
		int mat[][] = {{3,7,8}, {9,11,13}, {15,16,17}};
		System.out.println(luckyNumbers(mat));
	}

	public static List<Integer> luckyNumbers (int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        int row_min[] = new int[n];
        int col_max[] = new int[m];
        Arrays.fill(row_min, Integer.MAX_VALUE);
        for (int i = 0; i < n; i++) {
        	for (int j = 0; j < m; j++) {
        		row_min[i] = Math.min(row_min[i], matrix[i][j]);
        		col_max[j] = Math.max(col_max[j], matrix[i][j]);
        	}
        }
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
        	for (int j = 0; j < m; j++) {
        		if(matrix[i][j] == row_min[i] && matrix[i][j] == col_max[j])
        			res.add(matrix[i][j]);
        	}
        }

        return res;
    }
}