package leetcode;

public class removeDuplicates {
	public int removeDuplicates(int[] nums) {
        int result = 0;
        if( nums.length < 2)
        	return nums.length;
        for(int i=1 , j=1; i<nums.length-1; i++){
        	if( nums[i] != nums[j]){
        		nums[j+1] = nums[i];
        		j++;
        		result++;
        	}

        }
        return result;
    }
	/*
	 * 1.ɾ��һ���������ظ���Ԫ�أ�����������
	 * 2.54+46
	 */
}
