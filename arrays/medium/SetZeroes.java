// https://leetcode.com/problems/set-matrix-zeroes/

import java.util.*;

public class SetZeroes {
	public static void main(String[] args) {
		int matrix[][] = {{1,1,1},{1,0,1},{1,1,1}};
		setZeroes(matrix);	
	}

	public static void setZeroes(int[][] matrix) {
		Set<Integer> row = new HashSet<>();
		Set<Integer> col = new HashSet<>();

		int n = matrix.length, m = matrix[0].length;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(matrix[i][j] == 0) {
					row.add(i);
					col.add(j);
				}
			}
		}

		for (Integer i : row) {
			for(int j = 0; j < m; j++) {
				matrix[i.intValue()][j] = 0;
			}
		}

		for (Integer i : col) {
			for(int j = 0; j < n; j++) {
				matrix[j][i.intValue()] = 0;
			}
		}
    }
}