package leetcode152;

/**
 * Created by wangzunwen on 2016/11/19.
 */
public class findPeakElement162 {
    public int findPeakElement(int[] nums) {

    	
        int len = nums.length;
        
    	if( len ==1 || nums[0] > nums[1] )
    		return 0;
    	if( nums[len-2] < nums[len-1])
    		return len-1;
    	for( int i = 1 ; i < len-1 ; i++ ){

    		if( nums[i] > nums[i-1] && nums[i] > nums[i+1] )
    			return i;

    		if( nums[i] > nums[i+1] )
    			i++;
    	}
    	return 0;
    }
}
