package leetcode;

import java.util.Arrays;

public class threeSumClosest {
	public int threeSumClosest(int[] nums, int target) {
		
		
		
		
		
        Arrays.sort(nums);
        int result = nums[0]+nums[1]+nums[2];
        for( int i=0; i<nums.length-2; i++){
        	int j = i+1, k = nums.length-1;
        	if( k == j+1  ){
        		System.out.println(result+" "+result+" "+Math.abs(target-result)+" "+Math.abs(target-nums[i]-nums[j]-nums[k])+" "+(nums[i]+nums[j]+nums[k])+"最后一个");
        	    return result = Math.abs(target-result)>Math.abs(target-nums[i]-nums[j]-nums[k])?(nums[i]+nums[j]+nums[k]):result;
        	}
        	if( j<k && nums[i]+nums[j]+nums[k]>target ){
        		while( j+1<k && nums[i]+nums[j]+nums[k]>target)
        			k--;
        		int result1 = Math.abs(nums[i]+nums[j]+nums[k]-target)>Math.abs(nums[i]+nums[j]+nums[k+1]-target)
        				?nums[i]+nums[j]+nums[k+1]:nums[i]+nums[j]+nums[k];
        		System.out.println(result+" "+result1+" "+i+" "+j+" "+k+" k值左移");
        		result = Math.abs(target-result)>Math.abs(target-result1)?result1:result;
        		System.out.println(result+" "+result1+" "+i+" "+j+" "+k+" k");
        	}
        	if( j<k && nums[i]+nums[j]+nums[k]<target){
        		while( j+1<k && nums[i]+nums[j]+nums[k]<target)
        			j++;
        		int result1 = Math.abs(nums[i]+nums[j]+nums[k]-target)>Math.abs(nums[i]+nums[j-1]+nums[k]-target)
        				?nums[i]+nums[j-1]+nums[k]:nums[i]+nums[j]+nums[k];
        		result = Math.abs(target-result)>Math.abs(target-result1)?result1:result;
        		System.out.println(result+" "+result1+" "+i+" "+j+" "+k+" j值右移");
        	}
        	if( k == j+1 && k == nums.length-1  ){
        		System.out.println(result+" "+result+" "+Math.abs(target-result)+" "+Math.abs(target-nums[i]-nums[j]-nums[k])+" "+(nums[i]+nums[j]+nums[k])+"最后一个");
        	    result = Math.abs(target-result)>Math.abs(target-nums[i]-nums[j]-nums[k])?(nums[i]+nums[j]+nums[k]):result;
        	}
        	else if( j<k && nums[i]+nums[j]+nums[k]>target   ){
        		while( j+1<k && nums[i]+nums[j]+nums[k]>target)
        			k--;
        		int result1 = Math.abs(nums[i]+nums[j]+nums[k]-target)>Math.abs(nums[i]+nums[j]+nums[k+1]-target)
        				?nums[i]+nums[j]+nums[k+1]:nums[i]+nums[j]+nums[k];
        		System.out.println(result+" "+result1+" "+i+" "+j+" "+k+" k值左移");
        		result = Math.abs(target-result)>Math.abs(target-result1)?result1:result;
        		System.out.println(result+" "+result1+" "+i+" "+j+" "+k+" k");
        	}
        	if( j<k && nums[i]+nums[j]+nums[k] == target ){
        		System.out.println(result+" "+result+" "+i+" "+j+" "+k+"一样");
        		return target;
        	}
        			
        }
        System.out.println(result+" "+result+" ");
        return result;
    
	/*
	 * 1.求三个数相加的和与结果的数最相近的一个结果
	 * 2.第一次特么的提交了10次，不过结果很令人满意，94+2.
	 */

}
}
