// https://leetcode.com/problems/running-sum-of-1d-array/
package arrays;

public class RunningSum {
    public static void main(String[] args) {
        int arr[] = { 0, 2, 1, 5, 3, 4 };
        int newArr[] = runningSum(arr);
        for (int val : newArr) {
            System.out.print(val + " ");
        }
    }

    public static int[] runningSum(int[] nums) {
        int ans[] = new int[nums.length];
        ans[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            ans[i] = ans[i - 1] + nums[i];
        }
        return ans;
    }
}
