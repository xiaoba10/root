package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class threeSum {
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i = 0; i<nums.length; i++){
        	if(nums[i]>0)
        		break;
        	int j = i+1, target = -nums[i] , k = nums.length-1;
        	while( j<k ){
        		if( nums[j]+nums[k] == target){
        			result.add(Arrays.asList(nums[i],nums[j],nums[k]));
        			while( j+1<nums.length && nums[j] == nums[j+1])
        				j++;
        			while( k-1>=0 && nums[k] == nums[k-1])
        				k--;
        			j++;
        			k--;
        		}else if( nums[j]+nums[k] < target)
        			j++;
        		else
        			k--;
        	}
        	while( i+1<nums.length && nums[i] == nums[i+1])
        		i++;
        }
        
        
        
        
        
//        HashMap num = new HashMap();
//        for(int i = 0; i<nums.length; i++){
//            if( nums[i]>0)
//        		break;
//        	int j = i+1, target = -nums[i], k = 0;
//        	num.clear();
//        	
//        	for( ; j<nums.length ; j++){
//        		if( num.containsKey(target-nums[j])){
//        			List<Integer> cur = new ArrayList<Integer>();
//        			cur.add(nums[i]);
//        			cur.add(target-nums[j]);
//        			cur.add(nums[j]);
//        			result.add(cur);
//        			k = 1;
//        		}else
//        			num.put(nums[j], j);
//        		while( k == 1 && j+1<nums.length && nums[j] == nums[j+1])
//            		j++;
//        	}
//        	while( i+1<nums.length && nums[i] == nums[i+1])
//        		i++;
//        }        
        return result;
    }
	/*
	 * 1.����������ӵ���0���������
	 * 2.�����뵽���Ǳ���ö�٣�Ȼ��ֻ��14+2
	 * 3.֮���ַ����ǿ��Լ򻯵ģ������������֮����Ҫ����map��Ҳ��˴ﵽ92+7
	 * 
	 */
}
