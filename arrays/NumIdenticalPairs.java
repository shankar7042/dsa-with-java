// https://leetcode.com/problems/number-of-good-pairs/
package arrays;

public class NumIdenticalPairs {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 1, 3 };
        System.out.println(numIdenticalPairs(arr));
    }

    public static int numIdenticalPairs(int[] nums) {
        int count[] = new int[101];
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        for (int i = 0; i < count.length; i++) {
            ans += (count[i] * (count[i] - 1)) / 2;
        }
        return ans;
    }
}
