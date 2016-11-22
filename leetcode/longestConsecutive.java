package Package126;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by wangzunwen on 2016/11/6.
 */
public class longestConsecutive {
    public int longestConsecutive(int[] nums) {
        if( nums.length == 0)
            return 0;
        Set set = new HashSet<Integer>();

        for( int num : nums)
            set.add(num);
        int result = 1;

        for( int e : nums){
            int left = e-1;
            int right = e+1;
            int count = 1;
            while( set.contains(left )){
                set.remove(left);

                count++;
                left--;
            }
            while( set.contains(right) ){
                set.remove(right);

                count++;
                right++;
            }
            result = Math.max(result,count);


        }
    return result;




    }
}
