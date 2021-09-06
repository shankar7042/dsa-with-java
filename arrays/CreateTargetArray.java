// https://leetcode.com/problems/create-target-array-in-the-given-order/
package arrays;

public class CreateTargetArray {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 0 };
        int index[] = { 0, 1, 2, 3, 0 };

        int res[] = createTargetArray(nums, index);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        int target[] = new int[n];
        int i = 0;
        while (i < n) {
            if (index[i] >= i) {
                target[index[i]] = nums[i];
            } else {
                for (int j = n - 1; j > index[i]; j--) {
                    target[j] = target[j - 1];
                }
                target[index[i]] = nums[i];
            }
            i++;
        }
        return target;
    }
}
