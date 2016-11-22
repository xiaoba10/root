package leetcode;

public class canJump {
	public boolean canJump(int[] nums) {
        int maxlen = nums[0];
		int len = nums.length,nowlen = 0;
		if ( len < 2 )
		    return true;
		if( maxlen == 0)
		    return false;
		if( maxlen >= len-1)
		    return true;
		for( int i = 1;i<len-1;i++){
		    nowlen = i+nums[i];
		    if( nowlen > maxlen ){
		        maxlen = nowlen;
		        if( len-1 <= maxlen )
				    return true;
		    }
		    else if( i == maxlen )
				return false;
			
		}
		return true;
    }
}
