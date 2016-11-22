package leetcode62;

import java.util.Arrays;

public class minWindow {
	
	public static void main(String[] args){
		minWindow aaa = new minWindow();
		aaa.minWindow("23erwer", "dsfsdfsdc");
	}
	
	
	
	public String minWindow(String s, String t) {
		int len1 = s.length();
		int len2 = t.length();
		int[] pos = new int[256];
		for( int i = 0;i<len2;i++)
			pos[t.charAt(i)]++;
		int[] loc = new int[256];
		int min = len1+1,start = 0,end = 0,num = 0;
		int left = 0,right = 0;
		while( right < len1 ){
			if( num < len2 ){
				char ch = s.charAt(right);
				if( pos[ch] > 0){
					loc[ch]++;
					if( loc[ch] <= pos[ch] )
						num++;
				}
				right++;
			}
			while( num == len2 ){
				if( min > (right-left)){
					min = right-left;
					start = left;
					end = right;
				}
				char ch = s.charAt(left);
				if( loc[ch] == 0  )
					left++;
				else if( loc[ch] > pos[ch]){
					left++;
					loc[ch]--;
				}else{
					num--;
					loc[ch]--;
					left++;
				}
			}

		}
		if( min == len1+1)
			return "";
		char[] result = new char[min+1];
		for( int i = start,j = 0;i<=end;i++,j++)
			result[j] = s.charAt(i);
		return String.valueOf(result);

    }
}
