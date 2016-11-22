package leetcode101;

import java.util.Stack;

public class isPalindrome {
	public boolean isPalindrome(String s) {
		
		char[] word = s.toLowerCase().toCharArray();
		int len = s.length();
		int left = 0,right = len-1;
		while( left < right ){

			if( !((word[left] >= '0' && word[left] <= '9') || (word[left]>='a' && word[left]<='z' )) )
				left++;
			else if( !((word[right] >= '0' && word[right] <= '9') || (word[right]>='a' && word[right]<='z' )) )
				right--;
			else if( word[left] == word[right]){
				left++;
				right--;
			}else
				return false;
		}
		return true;

		
		
    }
}
