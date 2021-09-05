package arrays;

public class Shuffle {
    public static void main(String[] args) {
        int nums[] = { 2, 5, 1, 3, 4, 7 };
        int n = 3;
        int res[] = shuffle(nums, n);
        for (int val : res) {
            System.out.print(val + " ");
        }
    }

    public static int[] shuffle(int[] nums, int n) {
        int res[] = new int[nums.length];
        for (int i = 0, j = n, k = 0; k < nums.length; i++, j++) {
            res[k++] = nums[i];
            res[k++] = nums[j];
        }
        return res;
    }
}
