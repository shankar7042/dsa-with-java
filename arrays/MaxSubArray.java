// https://leetcode.com/problems/maximum-subarray/

public class MaxSubArray {
	public static void main(String[] args) {
		int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(arr));
	}

	public static int maxSubArray(int[] nums) {
        int curr = nums[0], max = nums[0], n = nums.length;
        for(int i = 1; i < n; i++) {
        	curr = Math.max(curr + nums[i], nums[i]);
        	max = Math.max(max, curr);
        }
        return max;
    }
}