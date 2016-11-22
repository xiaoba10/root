package leetcode152;

/**
 * Created by wangzunwen on 2016/11/18.
 */
public class findMin153 {
    public int findMin(int[] nums) {

    	if( nums.length == 1)
            return nums[0];
        int left = 0,right = nums.length-1;
        int mid = (left+right)/2;
        int first = nums[0];
        while( left < right ){


            if( nums[left] == nums[mid] ){
                first = Math.min(Math.min(first,nums[left]),nums[right]);
                break;
            }
            else if( nums[left] < nums[mid] ){
                left = mid;
                mid = (left+right)/2;
                first = Math.min(first,nums[left]);
            }else {
                right = mid;
                mid = (left+right)/2;
                first = Math.min(first,nums[mid]);
            }

        }
        return Math.min(first,nums[left]);
    }
}
