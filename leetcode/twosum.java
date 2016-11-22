package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class twosum {
	public int[] TwoSum(int[] nums, int target) {
		int[] result = new int[2];
		HashMap<Integer,Integer> num = new HashMap<Integer,Integer>();
		for( int i = 0; i< nums.length; i++){
			if(num.containsKey(target-nums[i]) ){
				result[0] = num.get(target-nums[i]);
				result[1] = i;
				return result;
			}
			num.put(nums[i], i);
		}
		return result;
		
		
//		int len=nums.length;
//        int[] num=nums.clone();
//        int[] result=new int[2];
//        int[] location=new int[2];
//        Arrays.sort(num);
//        for(int i=0,j=len-1;i<len;){
//        	if(num[i]+num[j]==target){
//        		result[0]=num[i];
//        		result[1]=num[j];
//        		break;
//        	}
//        	else if(num[i]+num[j]>target)
//        		j--;
//        	else
//        		i++;
//        		
//        }
//        System.out.println(Arrays.toString(nums));
//        for(int i=0,j=0;i<len;i++){
//        	if(nums[i]==result[0]||nums[i]==result[1]){
//        		location[j]=i+1;
//        		j++;
//        	}
//        }
//        return location;
    }
	
}

/*
 * 1.第一题，求一个数组中两个数字相加的和等于另一个数
 * 2.先排序，然后两个指针从两边分别遍历，遇到合适的停止。
 * 3.利用map可以实现o(n)的时间复杂度，比上面的算法好得多。58+30,不过时间一样
 * 
 * 
 */
