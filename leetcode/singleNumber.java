package Package126;

/**
 * Created by wangzunwen on 2016/11/14.
 */
public class singleNumber {
    public int singleNumber(int[] nums) {

    	int len = nums.length;
    	int result = nums[0];
    	for( int i = 1;i<len;i++){

    		result = result^nums[i];

    	}
    	return result;


    }
}
