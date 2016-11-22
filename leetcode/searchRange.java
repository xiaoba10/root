package leetcode;

public class searchRange {
	public int[] searchRange(int[] nums, int target) {
		int[] result = new int[2];
        result[0] = -1;
        result[1] = -1;
        int len = nums.length;
        int start = 0, end = len-1;
        if( len == 0 || target<nums[start] || target > nums[end]){
        	
        	return result;
        }        
        while( start <= end ){
        	int mid = (start+end)/2,mid2 = mid;
        	if( nums[mid] == target){
        	    int flag1,flag2,start1 = start,end1 = end;
        		end = mid-1;
        		
        		flag1 = flag2 = mid;
        		System.out.println(start1+"   "+end1);
        		while( start<=end ){
            		mid = (start+end)/2;
            		if(target == nums[mid]){
            			end = mid-1;
            			flag1 = mid;
            		}
            		else{ 
            			start = mid+1;
            			flag2 = mid;
            		}
            		if (flag1-flag2 == 1 && nums[flag2] != target )
            			break;
        		}
        		result[0] = flag1;
        		System.out.println(flag1+"   "+flag2);
        		
        		flag1 = flag2 = mid2;
        		start = mid2+1;
        		end = end1;
        		while( start<=end ){
            		mid = (start+end)/2;
            		if(target == nums[mid]){
            			start = mid+1;
            			flag1 = mid;
            		}
            		else{ 
            			end = mid-1;
            			flag2 = mid;
            		}
            		if( flag1-flag2 == 1 && nums[flag2] != target )
            			break;
            		
        		}
        		result[1] = flag1;
        		System.out.println(flag1+"   "+flag2);

        		break;
        	}else if( nums[mid] < target){
        		start = mid+1;
        		
        	}else if( nums[mid] > target)
        		end = mid-1;
        		
        }
        
        
        return result;
    }
	/*
	 * 1.找出排序数组中的所有数，第一次很慢，1
	 * 2.但如果用了简单的方法，反而55+8
	 * 3.如果直接使用两次二分查找，那么100
	 */
}
