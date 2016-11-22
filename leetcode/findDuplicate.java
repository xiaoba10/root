package Package126;

/**
 * Created by wangzunwen on 2016/11/15.
 */
public class findDuplicate {

    public int findDuplicate(int[] nums) {

        int len = nums.length;
        long num = (1+len)*(len-1)/2;
        for( int i = 0 ;i < len;i++)
            num-=nums[i];
        return (int)num;
    }
}
