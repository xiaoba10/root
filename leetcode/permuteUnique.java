package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class permuteUnique {
	public List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (nums.length == 0)
			return null;
		int len = nums.length - 1;
		Arrays.sort(nums);
		result = getResult(nums, 0, len, result);
		return result;
	}

	public List<List<Integer>> getResult(int[] nums, int k, int len,
			List<List<Integer>> result) {
		if (k == len) {
			List<Integer> subList = new ArrayList<Integer>();
			for (int i = 0; i < nums.length; i++) {
				subList.add(nums[i]);
			}
			result.add(subList);
		} else {
			for (int i = k; i <= len; i++) {
				if( nums[k] == nums[k+1])
					continue;
				int temp = nums[k];
				nums[k] = nums[i];
				nums[i] = temp;
				getResult(nums, k + 1, len, result);
				int temp1 = nums[k];
				nums[k] = nums[i];
				nums[i] = temp1;
			}
		}
		return result;
	}

    	
}
