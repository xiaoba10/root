package leetcode;

public class jump {
	public static void main(String[] args){
		int[] a = {1,2,3,4,5};
		System.out.println(jump.jump(a));
	}
	public static int jump(int[] nums){
		int len = nums.length;
		if( len < 2 )
			return 0;
		int maxlen = nums[0];
		int newlen = 0;
		int result = 1, prepos = 0;
		if (maxlen >= len-1)
            return result;
		for( int i =0;i<len;i++){
			newlen = i + nums[i];
			if( newlen > maxlen){
				
				if( prepos < i ){
					prepos = maxlen;
					result++;
				}	
				maxlen = newlen;
				if( maxlen >= len-1 )
					return result;
			}
		}
		return result;

	}
}
