package leetcode;

import java.util.Arrays;

public class removeElement {
	public int removeElement(int[] nums, int val) {
		int result = nums.length;
        if(nums.length == 0 )
        	return nums.length;
        for( int i=0,j = 0; i<nums.length; i++){
        	if( nums[i] != val){
        		nums[j] = nums[i];
        		j++;
        	}
        	else
        		result--;
        		
        }
        return result;
    }
	/*
	 * 1.删除数组中的val
	 * 2.70+30
	 */
}
