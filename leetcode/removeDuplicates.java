package leetcode62;

public class removeDuplicates {
	public int removeDuplicates(int[] nums) {

		int len = nums.length;
		if( len < 2 )
			return len;
		int flag = nums[0];
		int times = 1;
		int res = len;
		for( int i = 1 , j = 0;i<len;i++){
			if( flag == nums[i] ){
				if( times == 1)
					times++;
				else{
					res--;
					continue;
				}
			}else{
				flag = nums[i];
				times = 1;
			}
			nums[j] = nums[i];
			j++;
		}
		
        return res;
    }
}
