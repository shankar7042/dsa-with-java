package arrays;

/**
 * GetConcatenation
 */
public class GetConcatenation {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        int res[] = getConcatenation(arr);
        for (int val : res) {
            System.out.print(val + " ");
        }
    }

    public static int[] getConcatenation(int[] nums) {
        int ans[] = new int[2 * nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }
        return ans;
    }
}