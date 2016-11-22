package leetcode152;

/**
 * Created by wangzunwen on 2016/11/18.
 */
public class maxProduct {
    public int maxProduct(int[] nums) {
        int len = nums.length;
        if( nums.length == 1)
            return nums[0];
        int[] result = new int[2];
        int target = 0;

        int left_right = 0,right_left = 0;
        for( int i = 0 ; i < len ; i ++){
            if( nums[i] == 0){
                target = Math.max(target,result[0]);
                result[0] = 0;
                result[1] = 0;
                target = 0;
            }else if( nums[i] > 0 ){
                if( result[0] != 0)
                    result[0] *= nums[i];
                else
                    result[0] = nums[i];
            }else if( nums[i] < 0 ){
                if( result[1] == 0 ){
                    result[1] = nums[i]*(result[0] == 0?1:result[0]);
                    result[0] = 0;
                }
                else{
                    if( result[0] == 0){
                        result[0] = result[1]*nums[i];
                        result[1] = 0;
                    }else{
                        result[0] = result[0]*result[1]*nums[i];
                        result[1] = 0;
                    }
                }
            }
            left_right = Math.max(Math.max(result[0],target),left_right);

        }

        target = 0;
        result[0] = 0;
        result[1] = 0;
        for( int i = len-1;i>=0;i--){
            if( nums[i] == 0){
                target = Math.max(target,result[0]);
                result[0] = 0;
                result[1] = 0;
                target = 0;
            }else if( nums[i] > 0 ){
                if( result[0] != 0)
                    result[0] *= nums[i];
                else
                    result[0] = nums[i];
            }else if( nums[i] < 0 ){
                if( result[1] == 0 ){
                    result[1] = nums[i]*(result[0] == 0?1:result[0]);
                    result[0] = 0;
                }
                else{
                    if( result[0] == 0){
                        result[0] = result[1]*nums[i];
                        result[1] = 0;
                    }else{
                        result[0] = result[0]*result[1]*nums[i];
                        result[1] = 0;
                    }
                }
            }
            right_left = Math.max(Math.max(result[0],target),right_left);
        }


        return Math.max(left_right,right_left);
    }
}