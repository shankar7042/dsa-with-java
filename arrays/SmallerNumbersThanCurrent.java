// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SmallerNumbersThanCurrent {
    public static void main(String[] args) {
        int arr[] = { 8, 1, 2, 2, 3 };
        int res[] = smallerNumbersThanCurrent3(arr);
        for (int val : res) {
            System.out.print(val + " ");
        }
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];
        for (int i = 0; i < n; i++) {
            int ans = 0;
            for (int j = 0; j < n; j++) {
                if (j != i && nums[j] < nums[i]) {
                    ans++;
                }
            }
            res[i] = ans;
        }
        return res;
    }

    public static int[] smallerNumbersThanCurrent2(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];

        // 2 <= nums.length <= 500
        // 0 <= nums[i] <= 100
        int count[] = new int[101];

        // making frequency array
        for (int i = 0; i < n; i++) {
            count[nums[i]]++;
        }

        // calculating running sum
        for (int i = 1; i <= 100; i++) {
            count[i] += count[i - 1];
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0)
                res[i] = 0;
            else
                res[i] = count[nums[i] - 1];
        }
        return res;
    }

    public static int[] smallerNumbersThanCurrent3(int[] nums) {
        int copy[] = nums.clone();
        Arrays.sort(copy);
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.putIfAbsent(copy[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            copy[i] = map.get(nums[i]);
        }
        return copy;
    }
}
