// https://leetcode.com/problems/two-sum/

import java.util.*;

public class TwoSum {
	public static void main(String[] args) {
		int arr[] = {2,7,11,15};
		int res[] = twoSum(arr, 9);
		System.out.println(res[0] + " " + res[1]);
	}

	public static int[] twoSum(int[] nums, int target) {
        int res[] = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
        	if(map.containsKey(target - nums[i])) {
        		res[0] = i;
        		res[1] = map.get(target - nums[i]);
     			break;
        	}
        	map.put(nums[i], i);
        }

        return res;
    }
}