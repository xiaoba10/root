package leetcode;

public class searchInsert {
	public int searchInsert(int[] nums, int target) {
		if( nums.length == 0)
			return 0;
        int result = 0,flag1 = -1,flag2 = -1;
        int start = 0,end = nums.length-1;
        while( start <= end){
        	int mid = (start+end)/2;
        	if( nums[mid] > target ){
        		end = mid-1;
        		flag1 = mid;
        	}
        	else if( nums[mid] < target){
        		start = mid+1;
        		flag2 = mid;
        	}
        	else 
        		return mid;    
        	
        }
        if( start == end && nums[start] != target){
    		if( nums[start] > target){
    			flag1 = start;
    		}else 
    			flag2 = end;
    	}else if(start == end && nums[start] == target)
    	    return start;        if( flag1-flag2 == 1 )
        	result = flag1;
        else if( flag1 == 0)
        	result = 0;
        else if( flag2 == nums.length-1)
        	result = nums.length;
        
        
        return result;
    }
	/*
	 * 1.查找，第一次只有1
	 * 2.修改之后100；
	 */

}
