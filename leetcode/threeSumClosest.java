package leetcode;

import java.util.Arrays;

public class threeSumClosest {
	public int threeSumClosest(int[] nums, int target) {
		
		
		
		
		
        Arrays.sort(nums);
        int result = nums[0]+nums[1]+nums[2];
        for( int i=0; i<nums.length-2; i++){
        	int j = i+1, k = nums.length-1;
        	if( k == j+1  ){
        		System.out.println(result+" "+result+" "+Math.abs(target-result)+" "+Math.abs(target-nums[i]-nums[j]-nums[k])+" "+(nums[i]+nums[j]+nums[k])+"���һ��");
        	    return result = Math.abs(target-result)>Math.abs(target-nums[i]-nums[j]-nums[k])?(nums[i]+nums[j]+nums[k]):result;
        	}
        	if( j<k && nums[i]+nums[j]+nums[k]>target ){
        		while( j+1<k && nums[i]+nums[j]+nums[k]>target)
        			k--;
        		int result1 = Math.abs(nums[i]+nums[j]+nums[k]-target)>Math.abs(nums[i]+nums[j]+nums[k+1]-target)
        				?nums[i]+nums[j]+nums[k+1]:nums[i]+nums[j]+nums[k];
        		System.out.println(result+" "+result1+" "+i+" "+j+" "+k+" kֵ����");
        		result = Math.abs(target-result)>Math.abs(target-result1)?result1:result;
        		System.out.println(result+" "+result1+" "+i+" "+j+" "+k+" k");
        	}
        	if( j<k && nums[i]+nums[j]+nums[k]<target){
        		while( j+1<k && nums[i]+nums[j]+nums[k]<target)
        			j++;
        		int result1 = Math.abs(nums[i]+nums[j]+nums[k]-target)>Math.abs(nums[i]+nums[j-1]+nums[k]-target)
        				?nums[i]+nums[j-1]+nums[k]:nums[i]+nums[j]+nums[k];
        		result = Math.abs(target-result)>Math.abs(target-result1)?result1:result;
        		System.out.println(result+" "+result1+" "+i+" "+j+" "+k+" jֵ����");
        	}
        	if( k == j+1 && k == nums.length-1  ){
        		System.out.println(result+" "+result+" "+Math.abs(target-result)+" "+Math.abs(target-nums[i]-nums[j]-nums[k])+" "+(nums[i]+nums[j]+nums[k])+"���һ��");
        	    result = Math.abs(target-result)>Math.abs(target-nums[i]-nums[j]-nums[k])?(nums[i]+nums[j]+nums[k]):result;
        	}
        	else if( j<k && nums[i]+nums[j]+nums[k]>target   ){
        		while( j+1<k && nums[i]+nums[j]+nums[k]>target)
        			k--;
        		int result1 = Math.abs(nums[i]+nums[j]+nums[k]-target)>Math.abs(nums[i]+nums[j]+nums[k+1]-target)
        				?nums[i]+nums[j]+nums[k+1]:nums[i]+nums[j]+nums[k];
        		System.out.println(result+" "+result1+" "+i+" "+j+" "+k+" kֵ����");
        		result = Math.abs(target-result)>Math.abs(target-result1)?result1:result;
        		System.out.println(result+" "+result1+" "+i+" "+j+" "+k+" k");
        	}
        	if( j<k && nums[i]+nums[j]+nums[k] == target ){
        		System.out.println(result+" "+result+" "+i+" "+j+" "+k+"һ��");
        		return target;
        	}
        			
        }
        System.out.println(result+" "+result+" ");
        return result;
    
	/*
	 * 1.����������ӵĺ����������������һ�����
	 * 2.��һ����ô���ύ��10�Σ�����������������⣬94+2.
	 */

}
}
