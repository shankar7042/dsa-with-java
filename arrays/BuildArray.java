package arrays;

/**
 * BuildArray
 */
public class BuildArray {
    public static void main(String[] args) {
        int arr[] = { 0, 2, 1, 5, 3, 4 };
        int newArr[] = buildArray(arr);
        for (int val : newArr) {
            System.out.println(val);
        }
    }

    public static int[] buildArray(int[] nums) {
        int res[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[nums[i]];
        }
        return res;
    }
}