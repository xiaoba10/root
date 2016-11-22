package Package126;

/**
 * Created by wangzunwen on 2016/11/14.
 */
public class singleNumber2 {

    public int singleNumber(int[] nums) {


    	int result = 0;

    	for( int i = 0;i<32;i++){

    		int num = 0;
    		for( int j = 0;j<nums.length;j++){
    			if(( nums[j] >> i &1) == 1 ){
    				num++;
    			} 


    		}
    		num%=3;
    		result+=(num<<i);
    	}
    	return result;


    }
}
