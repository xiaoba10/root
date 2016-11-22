package leetcode;

public class maxSubArray {

	public static void main(String[] args) {

		maxSubArray aa = new maxSubArray();
		int[] tt = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(aa.maxSubArray(tt));
	}

	public int maxSubArray(int[] nums) {
		if (nums.length == 1)
			return nums[0];
		int preSum = nums[0];
		int max = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (preSum <= 0)
				preSum = nums[i];
			else {
				preSum += nums[i];
			}
			if (preSum > max)
				max = preSum;
		}
		return max;
	}
}
