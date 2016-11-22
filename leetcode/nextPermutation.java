package leetcode;

import java.util.Arrays;

public class nextPermutation {
	public void nextPermutation(int[] nums) {
		int len = nums.length;
		if(len == 0 || len == 1)
			return;
		int max = getMax(nums,0,len);
		if(max == len-1){
			max = nums[max];
			nums[len-1] = nums[len-2];
			nums[len-2] = max;
			return ;
		}
		getNextPer(nums,0,nums.length);
		
    }
	
	public void getNextPer(int[] nums,int start, int end){
		int max = getMax(nums,start,end);
		
		if( isOrder(nums,max) ){
			if( max == 0){
				Arrays.sort(nums);
				return ;
			}
			int replace = nums[max-1];
			int flag = nums[max], flag_i = max;
			for(int i=max+1;i<nums.length ;i++){
				if(nums[i]>replace && nums[i]<flag){
					flag = nums[i];
					flag_i = i;
				}
			}
			nums[max-1] = flag;
			nums[flag_i] = replace;
			Arrays.sort(nums, max, nums.length);
			return ;
		}
		else{
			
			
			
			getNextPer(nums,max+1,nums.length);
		}
	}
	
	
	public int getMax(int[] nums,int start,int end){
		int max = start ;
		for( int i = start; i< end; i++){
			if(nums[i] > nums[max])
				max = i;
		}	
		return max;
	}
	
	
	public boolean isOrder(int[] nums,int start){//是否是降序排列
		for( int i = start+1; i<nums.length-1 ; i++){
			if( nums[i] < nums[i+1] )
				return false;
		}
		return true;
	}
	/*
	 * 1.递归，因此比较慢，4.5+4.6
	 * 2.发现可以不用递归，找到一个非降序的地方，然后换一次，排序一次就好了，9.1+60
	 * 3.修改不用arrays.sort()可以达到100
	 * public void nextPermutation(int[] num) {
    int n=num.length;
    if(n<2)
        return;
    int flag = n-1;
    while(flag > 0 && num[flag] <= num[flag-1]){
        flag--;
    }
    int change = flag;
    if(flag == 0){
        for(int i=0;i<n/2;i++){
            int j = num[i];
            num[i] = num[n-i-1];
            num[n-i-1] = j;
        }
        return ;
    }
    while( change<n && num[flag-1]<num[change] ){
        change++;
    }
    int tt = num[flag-1];
    num[flag-1] = num[change-1];
    num[change-1] = tt;
    for(int i=0;i<(n-flag)/2;i++){
            int j = num[i+flag];
            num[i+flag] = num[n-i-1];
            num[n-i-1] = j;
        }
    return ;
    }
	 * 
	 */
}
