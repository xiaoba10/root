package leetcode152;

/**
 * Created by wangzunwen on 2016/11/18.
 */
public class findMin154 {
    public int findMin(int[] nums) {

        if( nums.length == 1)
            return nums[0];
        int left = 0,right = nums.length-1;
        int mid = (left+right)/2;
        int first = nums[0];

        while( left < right ){


        	if( left == right-1 ){
        		first = Math.min(first,nums[left]);
        		left++; 
        	}
        	else if( nums[mid] == nums[left]){
        		left++;
        		mid = (left+right)/2;
        	}else if( nums[left] < nums[mid] ){
        		left = mid;
        		mid = (left+right)/2;
        		first = Math.min(first,nums[left]);
        	}else{
        		right = mid;
        		mid = (left+right)/2;
        		first = Math.min(first,nums[left]);
        	}

        }
        return Math.min(first,nums[left]);

    }

}
