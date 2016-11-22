package leetcode;

import java.util.HashSet;

public class firstMissingPositive {
	public int firstMissingPositive(int[] nums) {
		int len = nums.length;
		int i = 0;
		while( i<len){
			if( nums[i] == i+1 || nums[i]<0 || nums[i] > len+1)
				i++;
			else if( nums[i] != nums[nums[i]-1])
				swap(nums,i,nums[i]-1);
			else
				i++;
		}
		i = 0;
		while(i<len && nums[i] == i+1)
			i++;
		return i+1;
    }
	
	public void swap(int[] nums, int a,int b){
		int num = nums[a];
		nums[a] = nums[b];
		nums[b] = num;
	}
	/*
	 * 1.求第一个缺少的正数，相同思路很简单。
	 */
}
