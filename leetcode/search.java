package leetcode62;

public class search {
	public boolean search(int[] nums, int target) {
        int len = nums.length;
        if( len == 0)
        	return false;
        int left = 0,right = len-1;
        int pos;
        if (target < nums[left] && target > nums[right] ) 
        	return false;
        if( target == nums[left] || left == nums[right])
        	return true;
        while( left < right ){
        	pos = (left+right)/2;
        	if( target == nums[pos])
        		return true;
        	else if( nums[pos] > nums[left] ){
        		if( target >= nums[left] && target <= nums[pos])
        			right = pos;
        		else
        			left = pos+1;
        	}else if( nums[pos] < nums[right] ){
        		if( target <= nums[right] && target >= nums[pos])
        			left = pos;
        		else
        			right = pos;
        	}else if( nums[pos] == nums[left] ){
        		left++;
        	}else if( nums[pos] == nums[right] )
        		right--;
        }
        if( target == nums[left] || left == nums[right])
        	return true;
        else
        	return false;
        	
    }
}
