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
 * 1.��һ�⣬��һ������������������ӵĺ͵�����һ����
 * 2.������Ȼ������ָ������߷ֱ�������������ʵ�ֹͣ��
 * 3.����map����ʵ��o(n)��ʱ�临�Ӷȣ���������㷨�õöࡣ58+30,����ʱ��һ��
 * 
 * 
 */
