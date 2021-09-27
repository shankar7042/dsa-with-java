// https://leetcode.com/problems/product-of-array-except-self/

import java.util.*;

public class ProductExceptSelf {
	public static void main(String[] args) {
		int nums[] = {-1,1,0,-3,3};
		System.out.println(Arrays.toString(productExceptSelf(nums)));
	}

	public static int[] productExceptSelf(int[] nums) {
		int n = nums.length;
		int left[] = new int[n];
		int right[] = new int[n];

		left[0] = nums[0];
		right[n-1] = nums[n-1];

		for(int i = 1; i < n; i++) 
			left[i] = left[i-1] * nums[i];

		for(int i = n-2; i >= 0; i--)
			right[i] = right[i+1] * nums[i];

		int res[] = new int[n];
		res[0] = right[1];
		res[n-1] = left[n-2];

		for(int i = 1; i < n-1; i++) {
			res[i] = left[i-1] * right[i+1];
		}

		return res;
    }
}