// https://leetcode.com/problems/spiral-matrix/
import java.util.*;

public class SpiralOrder {
	public static void main(String[] args) {
		int mat[][] = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(spiralOrder(mat));
	}

	public static List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        int top = 0, bottom = n-1, left = 0, right = m-1;
        int dir = 0;
        
        List<Integer> res = new ArrayList<>();

        while(top <= bottom && left <= right) {
        	if(dir == 0) {
        		for(int i = left; i <= right; i++) {
        			res.add(matrix[top][i]);
        		}
        		top++;
        	}
        	if(dir == 1) {
        		for(int i = top; i <= bottom; i++) {
        			res.add(matrix[i][right]);
        		}
        		right--;
        	}
        	if(dir == 2) {
        		for(int i = right; i >= left; i--) {
        			res.add(matrix[bottom][i]);
        		}
        		bottom--;
        	}
        	if(dir == 3) {
        		for(int i = bottom; i >= top; i--) {
        			res.add(matrix[i][left]);
        		}
        		left++;
        	}

        	dir = (dir + 1) % 4;
        }
        return res;
    }
}