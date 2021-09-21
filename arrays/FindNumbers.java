// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
package arrays;

public class FindNumbers {
    public static void main(String[] args) {
        int nums[] = { 12, 345, 2, 6, 7896 };
        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if ((num >= 10 && num <= 99) || (num >= 1000 && num <= 9999) || num == 100000)
                count++;
        }
        return count;
    }
}