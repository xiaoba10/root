package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fourSum {
	public List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		for(int i=0; i<nums.length-3; i++){
			if(nums[i]<<2 > target) return result;
			if( i>0 && nums[i-1] == nums[i])
				continue;
			for( int j=nums.length-1; j>i+2; j--){
				if(nums[j]<<2 < target) break;
				if( j<nums.length-1 && nums[j+1] == nums[j] )
					continue;
				int per = i+1, after = j-1;
				while(per<nums.length && after>=0 && per<after){
					if( i == 0 )
						System.out.println(nums[per]+nums[after]+nums[i]+nums[j]);
					if( nums[per]+nums[after]+nums[i]+nums[j]>target )
						after--;
					else if( nums[per]+nums[after]+nums[i]+nums[j]<target )
						per++;
					else if( nums[per]+nums[after]+nums[i]+nums[j] == target ){
						Integer[] ans = {nums[i],nums[per],nums[after],nums[j]};
						result.add(Arrays.asList(ans));
						System.out.println(ans[0]);
						after--;
						while( per<after && nums[after] == nums[after+1])
							after--;
						per++;
						while( per<after && nums[per] == nums[per-1])
							per++;
					}
				}
			}
		}			
		return result;
        
    }
	/*
	 * 1.求四个数的和等于一个值的所有组合
	 * 2.48+4第一次，想到的是基于求twosum的一个想法。
	 * 3.if(nums[i]<<2 > target) return result;
	 * if(nums[j]<<2 < target) break;
	 * 只是多了这两句，就成了93
	 */
}
